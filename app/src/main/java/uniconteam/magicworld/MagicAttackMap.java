package uniconteam.magicworld;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ThreadLocalRandom;

public class MagicAttackMap extends View{
    
    MagicMob magicMob = new MagicMob();
    MagicHero magicHero = new MagicHero();
    MwConsortium mwConsortium = new MwConsortium();
    
    void drawHealthBar(float rx, float ry, Canvas canvas, Bitmap hearth, int size, int hpCount, int hpp) {
        int heartSize = size;
        int padding = hpp;
        
        for(int i = 0; i < hpCount; i++) {
            float x = rx + i * heartSize;
            float y = ry;
            canvas.drawBitmap(hearth, null, new RectF( x+(padding*i), y, x+(padding*i)+heartSize, y+heartSize), null);
        }
        magicHero.heroHpCheck();
    }
    void drawPlants(Canvas canvas, float x, float y, float distance){
        canvas.drawBitmap(mapBush, null, new RectF(x, y, x+100, y+100), null);
        canvas.drawBitmap(mapBush, null, new RectF(x + distance, y + distance, x+100+distance, y+100+distance), null);
    }
    void drawLoot(Canvas canvas, float x, float y){
        MagicMob.slimeDead = true;
        canvas.drawBitmap(mucusLoot, null, new RectF(x+100, y+100, x+300, y+300), null);
        MagicMob.slimeX = 24000;
        MagicMob.slimeY = 24000;
    }
    
	// All objects
    public Bitmap john; // John hero image
    public Bitmap slime; // Slime image
    public Bitmap tikvach; // Tikvach image
    Bitmap buttonUp; // Buttons 1-4 \/
    Bitmap buttonDown;
    Bitmap buttonLeft;
    Bitmap buttonRight;
    Bitmap heroHp; // Hero hp
    Bitmap mobHp; // Mob hp
    Bitmap heroItem; // Hero item
    Bitmap buttonAttack; // Hero attack button
    Bitmap mapTree;
    Bitmap mapBush;
    Bitmap johnCard;
    public static Bitmap mucusLoot;
    Timer timer = new Timer();
    TimerTask timerTask;
    public int currentFrame = 0;
    public int fps = 9;
    private int touchTime = 0;
    public int canvasX;
    public int canvasY;
    public static int mobTimer = 0;
    public int mobSpawnX = 0;
    public int mobSpawnY = 0;
    public boolean mobSpawnRule = true;
    public boolean johnAnimationRule = false;
    public boolean heroAttackRule = false;
    public static boolean gameStoped = false;
    boolean plantDrawed = false;
    float plantX;
    float plantY;
    float plantDistance;
    
    public Handler mHandler;
    public Runnable mRunnable;

    // Array animation john and slime
    Bitmap[] johnWalkBitmaps = new Bitmap[]{ BitmapFactory.decodeResource(getResources(), R.drawable.magicworld_hero_john_animation_walk_1), BitmapFactory.decodeResource(getResources(), R.drawable.magicworld_hero_john_animation_walk_2), BitmapFactory.decodeResource(getResources(), R.drawable.magicworld_hero_john_animation_walk_3),};
    Bitmap[] johnAttackBitmaps = new Bitmap[]{ BitmapFactory.decodeResource(getResources(), R.drawable.magicworld_hero_john_animation_fight_1), BitmapFactory.decodeResource(getResources(), R.drawable.magicworld_hero_john_animation_fight_2), BitmapFactory.decodeResource(getResources(), R.drawable.magicworld_hero_john_animation_fight_3),};
    Bitmap[] slimeBitmaps = new Bitmap[]{ BitmapFactory.decodeResource(getResources(), R.drawable.magicworld_mob_slime_animation_walk_1), BitmapFactory.decodeResource(getResources(), R.drawable.magicworld_mob_slime_animation_walk_2), BitmapFactory.decodeResource(getResources(), R.drawable.magicworld_mob_slime_animation_walk_3),};
    Bitmap[] tikvachBitmaps = new Bitmap[]{ BitmapFactory.decodeResource(getResources(), R.drawable.magicworld_mob_tikvach_animation_walk_1), BitmapFactory.decodeResource(getResources(), R.drawable.magicworld_mob_tikvach_animation_walk_2), BitmapFactory.decodeResource(getResources(), R.drawable.magicworld_mob_tikvach_animation_walk_3),};
    
	public MagicAttackMap (Context context){
		super(context);
        
        john = BitmapFactory.decodeResource(context.getResources(), R.drawable.magicworld_hero_john_animation_walk_2);

        mHandler = new Handler();
        mRunnable = () -> {
                    johnAnimationRule = false;
                    heroAttackRule = false;
                    john = BitmapFactory.decodeResource(context.getResources(),R.drawable.magicworld_hero_john_animation_walk_2);
                };

        // Draw objects
        buttonUp = BitmapFactory.decodeResource(context.getResources(), R.drawable.magicworld_button_up);
        buttonDown = BitmapFactory.decodeResource(context.getResources(), R.drawable.magicworld_button_down);
        buttonRight = BitmapFactory.decodeResource(context.getResources(), R.drawable.magicworld_button_right);
        buttonLeft = BitmapFactory.decodeResource(context.getResources(), R.drawable.magicworld_button_left);
        buttonAttack = BitmapFactory.decodeResource(context.getResources(), R.drawable.magicworld_button_attack);
        
        heroHp = BitmapFactory.decodeResource(context.getResources(), R.drawable.magicworld_hero_hp);
        mobHp = BitmapFactory.decodeResource(context.getResources(), R.drawable.magicworld_mob_hp);
        
        mapTree = BitmapFactory.decodeResource(context.getResources(), R.drawable.magicworld_map_tree);
        mapBush = BitmapFactory.decodeResource(context.getResources(), R.drawable.magicworld_map_bush);
        
        johnCard = BitmapFactory.decodeResource(context.getResources(), R.drawable.magicworld_card_john);
        
        mucusLoot = BitmapFactory.decodeResource(context.getResources(), R.drawable.magicworld_item_mucus);
        
        new Thread(new Runnable(){
            @Override
            public void run(){
                while(true){
                    for(int j = 0; j < slimeBitmaps.length; j++){
                        currentFrame = j;
                        slime = slimeBitmaps[j];
                    try{
                        Thread.sleep(1000L / fps);
                    } catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }
            }
        } } ).start();
        
        new Thread(() -> {
            while(true){
                for(int j = 0; j < tikvachBitmaps.length; j++){
                    currentFrame = j;
                    tikvach = tikvachBitmaps[j];
                try{
                    Thread.sleep(1000L / fps);
                } catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        }
    }).start();
      }

    Paint paint = new Paint();

	@Override
	protected void onDraw(Canvas canvas) {
        
		super.onDraw(canvas);
        
        if(mobTimer == 150){
            magicMob.slimeRand();
            mobTimer += 5;
        } else {
            if(mobTimer < 200){ 
            mobTimer += 1;
            }
        }    
        canvasX = canvas.getWidth();
        canvasY = canvas.getHeight();
       
        if(mobSpawnRule){
        mobSpawnRule = false;    
        mobSpawnX = ThreadLocalRandom.current().nextInt(100, canvasX - 199);
        mobSpawnY = ThreadLocalRandom.current().nextInt(100, canvasY - 199);
        MagicMob.slimeX = mobSpawnX;
        MagicMob.slimeY = mobSpawnY;
        }
        
        if((MagicMob.slimeHp == 0 || MagicMob.slimeHp < 0) && MagicMob.slimeDead == false){
            drawLoot(canvas, MagicMob.slimeX, MagicMob.slimeY);
        }
        
        
        // Debug
        
        /*
        paint.setColor(Color.WHITE); 
        canvas.drawPaint(paint); 
        paint.setColor(Color.BLACK); 
        paint.setTextSize(60); 
        canvas.drawText(String.valueOf(MwMob.mwSlimeY), 10, 135, paint);
        canvas.drawText(String.valueOf(MwMob.mwSlimeX), 250, 135, paint);
        canvas.drawText(String.valueOf(MwHero.mwHeroY), 10, 235, paint);
        canvas.drawText(String.valueOf(MwHero.mwHeroX), 250, 235, paint);
        canvas.drawText("Debug", 10, 55, paint);
        */
        
        // Background
        
        // greenfield
        Paint rect_paint = new Paint();
        rect_paint.setStyle(Paint.Style.FILL);
        rect_paint.setColor(Color.parseColor("#2C6E3C"));
        rect_paint.setAlpha(0x100); // optional 
        canvas.drawRect(0, 0, 1200, 1000, rect_paint);
        
        // desert
        rect_paint.setStyle(Paint.Style.FILL);
        rect_paint.setColor(Color.parseColor("#f2ae24"));
        rect_paint.setAlpha(0x100); // optional 
        canvas.drawRect(0f, 1000f, 2200f, 2500f, rect_paint);
        
        BitmapFactory.Options opt = new BitmapFactory.Options();
        opt.inMutable = true;
        Bitmap brightBitmap = BitmapFactory.decodeResource(getResources(), R.drawable.magicworld_icon_coin, opt); 
        Canvas hero = new Canvas(brightBitmap);
        hero.drawBitmap(john, null, new RectF(MagicHero.heroX, MagicHero.heroY, MagicHero.heroX + 100, MagicHero.heroY + 100), null);
        canvas.drawBitmap(john, null, new RectF(MagicHero.heroX, MagicHero.heroY, MagicHero.heroX + 100, MagicHero.heroY + 100), null);
        
        // Tikvach
        canvas.drawBitmap(tikvach, null, new RectF(850f, 1900f, 990f, 2040f), null);

        // Allow or deny move of slime (limit on the edges of the canvas)
        if (MagicMob.slimeHp != 0) {

            if (MagicMob.slimeX > canvasX - 300) {
                magicMob.slimeXUpAcept = false;
            } else {
                magicMob.slimeXUpAcept = true;
            }
            if (MagicMob.slimeY > canvasY - 300) {
                magicMob.slimeYUpAcept = false;
            } else {
                magicMob.slimeYUpAcept = true;
            }
            if (MagicMob.slimeX < -50) {
                magicMob.slimeXDownAcept = false;
            } else {
                magicMob.slimeXDownAcept = true;
            }
            if (MagicMob.slimeY < -50) {
                magicMob.slimeYDownAcept = false;
            } else {
                magicMob.slimeYDownAcept = true;
            }
        }

        // Detecting objects for collision 
        magicHero.heroSpw();
        magicMob.slimeSpw();
        
        // Collision
        if (magicHero.getCollisionRect().isCollideWith(magicMob.getCollisionRect())) {
            if(!magicMob.slimeCooldown){
                magicMob.mobCooldown();
                MagicHero.heroY += 50;
                MagicMob.slimeY -= 50;
                MagicHero.heroHp -= 1;
            }
        }
        
        drawHealthBar(MagicMob.slimeX-100, MagicMob.slimeY-50, canvas, mobHp, 64, MagicMob.slimeHp, -18);
        drawHealthBar(500f, 1600f, canvas, heroHp, 124, MagicHero.heroHp, -38);
        
        if(!plantDrawed){
            plantX = ThreadLocalRandom.current().nextInt(100, canvasX - 199);
            plantY = ThreadLocalRandom.current().nextInt(100, canvasY - 199);
            plantDistance = plantY = ThreadLocalRandom.current().nextInt(80, 150);
            plantDrawed = true;
        }
        
        drawPlants(canvas, plantX, plantY, plantDistance);
        
        canvas.drawBitmap(slime, null, new RectF(MagicMob.slimeX, MagicMob.slimeY, MagicMob.slimeX + 100, MagicMob.slimeY + 100), null);
        canvas.drawBitmap(buttonUp, null, new RectF(300f, 1600f, 440f, 1740f), null);
        canvas.drawBitmap(buttonDown, null, new RectF(300f, 2000f, 440f, 2140f), null);
        canvas.drawBitmap(buttonLeft, null, new RectF(100f, 1800f, 240f, 1940f), null);
        canvas.drawBitmap(buttonRight, null, new RectF(500f, 1800f, 640f, 1940f), null);
        canvas.drawBitmap(buttonAttack, null, new RectF(750f, 1800f, 890f, 1940f), null);
        canvas.drawBitmap(johnCard, null, new RectF(650f, 1900f, 1150f, 2400f), null);
        // canvas.drawBitmap(mucusLoot, null, new RectF(850f, 2000f, 950f, 2100f), null);
        invalidate();
        }
    public boolean onTouchEvent(MotionEvent event) {

        // Detect click using x y z
        float xControll = event.getX();
        float yControll = event.getY();

        if (event.getAction() == MotionEvent.ACTION_DOWN) {

            if (xControll > 300f && xControll < 440f && yControll > 1600f && yControll < 1740f) {
                magicHero.heroUp();
                    if(!johnAnimationRule){
                    johnAnimationRule = true;
                    mHandler.postDelayed(mRunnable, 500);
                    new Thread(() -> {
                                while (johnAnimationRule) {
                                    for (int i = 0; i < johnWalkBitmaps.length; i++) {
                                      if(johnAnimationRule) {
                                        currentFrame = i;
                                        john = johnWalkBitmaps[i];
                                        try {
                                            Thread.sleep(1000L / fps);
                                        } catch (InterruptedException y) {
                                            y.printStackTrace();
                                        }
                                      postInvalidate();
                                      }
                                    }
                                }
                            })
                            .start();
                    }
                }
            if (xControll > 300f && xControll < 440f && yControll > 2000f && yControll < 2140f) {
                magicHero.heroDown();
                if(!johnAnimationRule){
                    johnAnimationRule = true;
                    mHandler.postDelayed(mRunnable, 500);
                    new Thread(() -> {
                                while (johnAnimationRule) {
                                    for (int i = 0; i < johnWalkBitmaps.length; i++) {
                                      if(johnAnimationRule) {
                                        currentFrame = i;
                                        john = johnWalkBitmaps[i];
                                        try {
                                            Thread.sleep(1000L / fps);
                                        } catch (InterruptedException y) {
                                            y.printStackTrace();
                                        }
                                      postInvalidate();
                                      }
                                    }
                                }
                            })
                            .start();
                    }
            }
            if (xControll > 100f && xControll < 240f && yControll > 1800f && yControll < 1940f) {
                magicHero.heroLeft();
                if(!johnAnimationRule){
                    johnAnimationRule = true;
                    mHandler.postDelayed(mRunnable, 500);
                    new Thread(() -> {
                                while (johnAnimationRule) {
                                    for (int i = 0; i < johnWalkBitmaps.length; i++) {
                                      if(johnAnimationRule) {
                                        currentFrame = i;
                                        john = johnWalkBitmaps[i];
                                        try {
                                            Thread.sleep(1000L / fps);
                                        } catch (InterruptedException y) {
                                            y.printStackTrace();
                                        }
                                      postInvalidate();
                                      }
                                    }
                                }
                            })
                            .start();
                    }
            }
            if (xControll > 500f && xControll < 640f && yControll > 1800f && yControll < 1940f) {
                magicHero.heroRight();
                if(!johnAnimationRule){
                    johnAnimationRule = true;
                    mHandler.postDelayed(mRunnable, 500);
                    new Thread(() -> {
                                while (johnAnimationRule) {

                                    for (int i = 0; i < johnWalkBitmaps.length; i++) {
                                      if(johnAnimationRule) {
                                        currentFrame = i;
                                        john = johnWalkBitmaps[i];
                                        try {
                                            Thread.sleep(1000L / fps);
                                        } catch (InterruptedException y) {
                                            y.printStackTrace();
                                        }
                                      postInvalidate();
                                      }
                                    }
                                }
                            })
                            .start();
                    }
            }
            if (xControll > 750f && xControll < 890f && yControll > 1800f && yControll < 1940f) {
              if(!heroAttackRule){
                heroAttackRule = true;    
                mHandler.postDelayed(mRunnable, 500);
                new Thread(() -> {
                            while (heroAttackRule) {
                                for (int a = 0; a < johnAttackBitmaps.length; a++) {
                                  if(heroAttackRule){
                                    currentFrame = a;
                                    john = johnAttackBitmaps[a];
                                    try {
                                        Thread.sleep(1000L / fps);
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
                                }
                                postInvalidate();
                                }
                            }
                        })
                        .start();
                    }

                if (magicHero.getCollisionRect().isCollideWith(magicMob.getCollisionRect())) {
                    MagicHero.heroY += 20;
                    MagicMob.slimeY -= 10;
                    MagicMob.slimeHp -= 1;
                }
            }
        }
        if (event.getAction() == MotionEvent.ACTION_UP) {
            mHandler.removeCallbacks(mRunnable);
            johnAnimationRule = false;
            heroAttackRule = false;
        }
        return super.onTouchEvent(event);
    }
}
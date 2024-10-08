package timisongdev.magicworld.attack;

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
import timisongdev.magicworld.R;

public class MagicAttackMap extends View {
    
    MagicMob magicMob = new MagicMob();
    MagicHero magicHero = new MagicHero();
    
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
    public Bitmap slime; // Slime image
    public Bitmap tikvach; // Tikvach image
    Bitmap heroHp; // Hero hp
    Bitmap mobHp; // Mob hp
    Bitmap heroItem; // Hero item
    Bitmap mapTree;
    Bitmap mapBush;
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
    int map[] = {};
    
    public Handler mHandler;
    public Runnable mRunnable;

    // Array animation john and slime
    Bitmap[] johnWalkBitmaps = new Bitmap[]{ BitmapFactory.decodeResource(getResources(), R.drawable.magicworld_hero_john_animation_walk_1), BitmapFactory.decodeResource(getResources(), R.drawable.magicworld_hero_john_animation_walk_2), BitmapFactory.decodeResource(getResources(), R.drawable.magicworld_hero_john_animation_walk_3),};
    Bitmap[] johnAttackBitmaps = new Bitmap[]{ BitmapFactory.decodeResource(getResources(), R.drawable.magicworld_hero_john_animation_fight_1), BitmapFactory.decodeResource(getResources(), R.drawable.magicworld_hero_john_animation_fight_2), BitmapFactory.decodeResource(getResources(), R.drawable.magicworld_hero_john_animation_fight_3),};
    Bitmap[] slimeBitmaps = new Bitmap[]{ BitmapFactory.decodeResource(getResources(), R.drawable.magicworld_mob_slime_animation_walk_1), BitmapFactory.decodeResource(getResources(), R.drawable.magicworld_mob_slime_animation_walk_2), BitmapFactory.decodeResource(getResources(), R.drawable.magicworld_mob_slime_animation_walk_3),};
    Bitmap[] tikvachBitmaps = new Bitmap[]{ BitmapFactory.decodeResource(getResources(), R.drawable.magicworld_mob_tikvach_animation_walk_1), BitmapFactory.decodeResource(getResources(), R.drawable.magicworld_mob_tikvach_animation_walk_2), BitmapFactory.decodeResource(getResources(), R.drawable.magicworld_mob_tikvach_animation_walk_3),};
    
	public MagicAttackMap (Context context){
		super(context);
        
        // addContentView(joystickView, new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));

        GameElements gameElements = new GameElements(context);
        HeroElement heroElement = new HeroElement(context);
        BackElement backElement = new BackElement(context);

        mHandler = new Handler();
        mRunnable = () -> {
                    johnAnimationRule = false;
                    heroAttackRule = false;
                    HeroElement.john = BitmapFactory.decodeResource(context.getResources(),R.drawable.magicworld_hero_john_animation_walk_2);
                };
        
        
        // Draw objects
        HeroElement.john = BitmapFactory.decodeResource(context.getResources(), R.drawable.magicworld_hero_john_animation_walk_2);
        GameElements.buttonUp = BitmapFactory.decodeResource(context.getResources(), R.drawable.magicworld_button_up);
        GameElements.buttonDown = BitmapFactory.decodeResource(context.getResources(), R.drawable.magicworld_button_down);
        GameElements.buttonRight = BitmapFactory.decodeResource(context.getResources(), R.drawable.magicworld_button_right);
        GameElements.buttonLeft = BitmapFactory.decodeResource(context.getResources(), R.drawable.magicworld_button_left);
        GameElements.buttonAttack = BitmapFactory.decodeResource(context.getResources(), R.drawable.magicworld_button_attack);
        GameElements.johnCard = BitmapFactory.decodeResource(context.getResources(), R.drawable.magicworld_card_john);
        
        heroHp = BitmapFactory.decodeResource(context.getResources(), R.drawable.magicworld_hero_hp);
        mobHp = BitmapFactory.decodeResource(context.getResources(), R.drawable.magicworld_mob_hp);
        
        mapTree = BitmapFactory.decodeResource(context.getResources(), R.drawable.magicworld_map_tree);
        mapBush = BitmapFactory.decodeResource(context.getResources(), R.drawable.magicworld_map_bush);
       
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
    
	protected void onDraw(Canvas background) {

        BitmapFactory.Options opt = new BitmapFactory.Options();
        opt.inMutable = true;
        Bitmap brightBitmap = BitmapFactory.decodeResource(getResources(), R.drawable.magicworld_icon_coin, opt); 
        
        
        if(mobTimer == 150){
            magicMob.slimeRand();
            mobTimer += 5;
        } else {
            if(mobTimer < 200){ 
            mobTimer += 1;
            }
        }    
        canvasX = background.getWidth();
        canvasY = background.getHeight();
        
        if(mobSpawnRule){
        mobSpawnRule = false;    
        mobSpawnX = ThreadLocalRandom.current().nextInt(100, canvasX - 199);
        mobSpawnY = ThreadLocalRandom.current().nextInt(100, canvasY - 199);
        MagicMob.slimeX = mobSpawnX;
        MagicMob.slimeY = mobSpawnY;
        }
        
        if((MagicMob.slimeHp == 0 || MagicMob.slimeHp < 0) && MagicMob.slimeDead == false){
            drawLoot(background, MagicMob.slimeX, MagicMob.slimeY);
        }
        // Debug
        
        paint.setColor(Color.WHITE); 
        background.drawPaint(paint); 
        paint.setColor(Color.BLACK); 
        paint.setTextSize(60); 
        // background.drawText(String.valueOf(MagicMob.slimeY), 10, 135, paint);
        // background.drawText(String.valueOf(MagicMob.slimeX), 250, 135, paint);
        background.drawText(String.valueOf(map), 10, 235, paint);
        // background.drawText(String.valueOf(JoystickView.touchY), 250, 235, paint);
        background.drawText("Debug", 10, 55, paint);
        
        // Tikvach
        background.drawBitmap(tikvach, null, new RectF(850f, 1900f, 990f, 2040f), paint);

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
        
        BackElement.drawBack(background);
        HeroElement.drawHero(background);
        drawHealthBar(MagicMob.slimeX-100, MagicMob.slimeY-50, background, mobHp, 64, MagicMob.slimeHp, -18);
        drawHealthBar(500f, 1600f, background, heroHp, 124, MagicHero.heroHp, -38);
        GameElements.drawBackground(background);
        drawPlants(background, plantX, plantY, plantDistance);
        
        if(MagicHero.loc == "up"){
            MagicMob.slimeY -= 20;
            MagicHero.loc = "";
        }
        if(MagicHero.loc == "down"){
            MagicMob.slimeY += 20;
            MagicHero.loc = "";
        }
        background.drawBitmap(slime, null, new RectF(MagicMob.slimeX, MagicMob.slimeY, MagicMob.slimeX + 100, MagicMob.slimeY + 100), null);
        background.drawBitmap(mucusLoot, null, new RectF(850f, 2000f, 950f, 2100f), null);
        background.drawRect(MagicHero.heroX + canvasX, MagicHero.heroY + canvasY, MagicHero.heroX + 100 + canvasX, MagicHero.heroY + 100 + canvasY, paint);
        invalidate();
        }
    
    @Override
   public boolean onTouchEvent(MotionEvent event) {

        // Detect click using x y z
        float xControll = event.getX();
        float yControll = event.getY();

        if (event.getAction() == MotionEvent.ACTION_DOWN) {

            if (xControll > 300f && xControll < 440f && yControll > 1600f && yControll < 1740f) {
                magicHero.heroUp();
                BackElement.biomeSizeY += 100;
                    if(!johnAnimationRule){
                    johnAnimationRule = true;
                    mHandler.postDelayed(mRunnable, 500);
                    new Thread(() -> {
                                while (johnAnimationRule) {
                                    for (int i = 0; i < johnWalkBitmaps.length; i++) {
                                      if(johnAnimationRule) {
                                        currentFrame = i;
                                        HeroElement.john = johnWalkBitmaps[i];
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
                BackElement.biomeSizeY -= 100;
                if(!johnAnimationRule){
                    johnAnimationRule = true;
                    mHandler.postDelayed(mRunnable, 500);
                    new Thread(() -> {
                                while (johnAnimationRule) {
                                    for (int i = 0; i < johnWalkBitmaps.length; i++) {
                                      if(johnAnimationRule) {
                                        currentFrame = i;
                                        HeroElement.john = johnWalkBitmaps[i];
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
                                        HeroElement.john = johnWalkBitmaps[i];
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
                                        HeroElement.john = johnWalkBitmaps[i];
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
                                    HeroElement.john = johnAttackBitmaps[a];
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
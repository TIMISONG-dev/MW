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

public class MwBattleFieldMap extends View{
    
    MwMob mwMob = new MwMob();
    MwHero mwHero = new MwHero();
    MwConsortium mwConsortium = new MwConsortium();
    
    void drawHealthBar(float rx, float ry, Canvas canvas, Bitmap hearth, int size, int hpCount, int hpp) {
        int heartSize = size;
        int padding = hpp;
        
        for(int i = 0; i < hpCount; i++) {
            float x = rx + i * heartSize;
            float y = ry;
            canvas.drawBitmap(hearth, null, new RectF( x+(padding*i), y, x+(padding*i)+heartSize, y+heartSize), null);
        }
        mwHero.mwHeroHpCheck();
        mwMob.mwSlimeHpCheck();
    }
    void drawPlants(Canvas canvas, float x, float y, int count){
        for(int i = 0; i < count; i++){
            canvas.drawBitmap(mwMapBush, null, new RectF(x, y, x+100, y+100), null);
            canvas.drawBitmap(mwMapTree, null, new RectF(x+500, y+700, x+600, y+800), null);
        }
    }
    
	// All objects
    public Bitmap mwJohn; // John hero image
    public Bitmap mwSlime; // Slime image
    public Bitmap mwTikvach; // Tikvach image
    Bitmap mwButtonUp; // Buttons 1-4 \/
    Bitmap mwButtonDown;
    Bitmap mwButtonLeft;
    Bitmap mwButtonRight;
    Bitmap mwHeroHp; // Hero hp
    Bitmap mwMobHp; // Mob hp
    Bitmap mwHeroItem; // Hero item
    Bitmap mwButtonAttack; // Hero attack button
    Bitmap mwMapTree;
    Bitmap mwMapBush;
    Bitmap mwJohnCard;
    String mwBiome = "landscape"; // Which background color #2C6E3C
    Timer mwTimer = new Timer();
    TimerTask mwTimerTask;
    public int currentFrame = 0;
    public int fps = 9;
    private int mwTouchTime = 0;
    public int mwCanvasX;
    public int mwCanvasY;
    public static int mwMobTimer = 0;
    public int mwMobSpawnX = 0;
    public int mwMobSpawnY = 0;
    public boolean mwMobSpawnRule = true;
    public boolean mwJohnAnimationRule = false;
    public boolean mwHeroAttackRule = false;
    public static boolean mwGameStoped = false;
    
    public Handler mHandler;
    public Runnable mRunnable;

    // Array animation john and slime
    Bitmap[] mwJohnWalkBitmaps = new Bitmap[]{ BitmapFactory.decodeResource(getResources(), R.drawable.magicworld_hero_john_animation_walk_1), BitmapFactory.decodeResource(getResources(), R.drawable.magicworld_hero_john_animation_walk_2), BitmapFactory.decodeResource(getResources(), R.drawable.magicworld_hero_john_animation_walk_3),};
    Bitmap[] mwJohnAttackBitmaps = new Bitmap[]{ BitmapFactory.decodeResource(getResources(), R.drawable.magicworld_hero_john_animation_fight_1), BitmapFactory.decodeResource(getResources(), R.drawable.magicworld_hero_john_animation_fight_2), BitmapFactory.decodeResource(getResources(), R.drawable.magicworld_hero_john_animation_fight_3),};
    Bitmap[] mwSlimeBitmaps = new Bitmap[]{ BitmapFactory.decodeResource(getResources(), R.drawable.magicworld_mob_slime_animation_walk_1), BitmapFactory.decodeResource(getResources(), R.drawable.magicworld_mob_slime_animation_walk_2), BitmapFactory.decodeResource(getResources(), R.drawable.magicworld_mob_slime_animation_walk_3),};
    Bitmap[] mwTikvachBitmaps = new Bitmap[]{ BitmapFactory.decodeResource(getResources(), R.drawable.magicworld_mob_tikvach_animation_walk_1), BitmapFactory.decodeResource(getResources(), R.drawable.magicworld_mob_tikvach_animation_walk_2), BitmapFactory.decodeResource(getResources(), R.drawable.magicworld_mob_tikvach_animation_walk_3),};
    
	public MwBattleFieldMap (Context context){
		super(context);
        
        mwJohn = BitmapFactory.decodeResource(context.getResources(), R.drawable.magicworld_hero_john_animation_walk_2);

        mHandler = new Handler();
        mRunnable =
                new Runnable() {
                    @Override
                    public void run() {
                        mwJohnAnimationRule = false;
                        mwHeroAttackRule = false;
                        mwJohn = BitmapFactory.decodeResource(context.getResources(),R.drawable.magicworld_hero_john_animation_walk_2);
                    }
                };

        // Draw objects
        mwButtonUp = BitmapFactory.decodeResource(context.getResources(), R.drawable.magicworld_button_up);
        mwButtonDown = BitmapFactory.decodeResource(context.getResources(), R.drawable.magicworld_button_down);
        mwButtonRight = BitmapFactory.decodeResource(context.getResources(), R.drawable.magicworld_button_right);
        mwButtonLeft = BitmapFactory.decodeResource(context.getResources(), R.drawable.magicworld_button_left);
        mwButtonAttack = BitmapFactory.decodeResource(context.getResources(), R.drawable.magicworld_button_attack);
        
        mwHeroHp = BitmapFactory.decodeResource(context.getResources(), R.drawable.magicworld_hero_hp);
        mwMobHp = BitmapFactory.decodeResource(context.getResources(), R.drawable.magicworld_mob_hp);
        
        mwMapTree = BitmapFactory.decodeResource(context.getResources(), R.drawable.magicworld_map_tree);
        mwMapBush = BitmapFactory.decodeResource(context.getResources(), R.drawable.magicworld_map_bush);
        
        mwJohnCard = BitmapFactory.decodeResource(context.getResources(), R.drawable.magicworld_card_john);
        
        
        new Thread(new Runnable(){
            @Override
            public void run(){
                while(true){
                    for(int j = 0; j < mwSlimeBitmaps.length; j++){
                        currentFrame = j;
                        mwSlime = mwSlimeBitmaps[j];
                    try{
                        Thread.sleep(1000L / fps);
                    } catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }
            }
        } } ).start();
        
        new Thread(new Runnable(){
            @Override
            public void run(){
                while(true){
                    for(int j = 0; j < mwTikvachBitmaps.length; j++){
                        currentFrame = j;
                        mwTikvach = mwTikvachBitmaps[j];
                    try{
                        Thread.sleep(1000L / fps);
                    } catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }
            }
        } } ).start();
      }

    Paint paint = new Paint();

	@Override
	protected void onDraw(Canvas canvas) {
        
		super.onDraw(canvas);
        
        if(mwMobTimer == 150){
            mwMob.mwSlimeRand();
            mwMobTimer += 5;
        } else {
            if(mwMobTimer < 200){ 
            mwMobTimer += 1;
            }
        }    
        mwCanvasX = canvas.getWidth();
        mwCanvasY = canvas.getHeight();
       
        if(mwMobSpawnRule){
        mwMobSpawnRule = false;    
        mwMobSpawnX = ThreadLocalRandom.current().nextInt(100, mwCanvasX - 199);
        mwMobSpawnY = ThreadLocalRandom.current().nextInt(100, mwCanvasY - 199);
        MwMob.mwSlimeX = mwMobSpawnX;
        MwMob.mwSlimeY = mwMobSpawnY;
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
        hero.drawBitmap(mwJohn, null, new RectF(MwHero.mwHeroX, MwHero.mwHeroY, MwHero.mwHeroX + 100, MwHero.mwHeroY + 100), null);
        canvas.drawBitmap(mwJohn, null, new RectF(MwHero.mwHeroX, MwHero.mwHeroY, MwHero.mwHeroX + 100, MwHero.mwHeroY + 100), null);
        
        // Tikvach
        canvas.drawBitmap(mwTikvach, null, new RectF(850f, 1900f, 990f, 2040f), null);

        // Allow or deny move of slime (limit on the edges of the canvas)
        if (MwMob.mwSlimeHp != 0) {
            if (MwHero.mwHeroX > mwCanvasX || MwHero.mwHeroX < -80) {
                mwBiome = "desert";
            }
            if (MwHero.mwHeroY > mwCanvasY || MwHero.mwHeroY < -80) {
                mwBiome = "landscape";
            }

            if (MwMob.mwSlimeX > mwCanvasX - 300) {
                mwMob.mwSlimeXUpAcept = false;
            } else {
                mwMob.mwSlimeXUpAcept = true;
            }
            if (MwMob.mwSlimeY > mwCanvasY - 300) {
                mwMob.mwSlimeYUpAcept = false;
            } else {
                mwMob.mwSlimeYUpAcept = true;
            }
            if (MwMob.mwSlimeX < -50) {
                mwMob.mwSlimeXDownAcept = false;
            } else {
                mwMob.mwSlimeXDownAcept = true;
            }
            if (MwMob.mwSlimeY < -50) {
                mwMob.mwSlimeYDownAcept = false;
            } else {
                mwMob.mwSlimeYDownAcept = true;
            }
        }

        // Detecting objects for collision 
        mwHero.MwHeroSpw();
        mwMob.MwSlimeSpw();
        
        // Collision
        if (mwHero.getCollisionRect().CollidesWith(mwMob.getCollisionRect())) {
            if(mwMob.mwSlimeCooldown == false){
                mwMob.MwMobCooldown();
                MwHero.mwHeroY += 50;
                MwMob.mwSlimeY -= 50;
                MwHero.mwHeroHp -= 1;
            }
        }
        
        drawHealthBar(MwMob.mwSlimeX-100, MwMob.mwSlimeY-50, canvas, mwMobHp, 64, MwMob.mwSlimeHp, -18);
        drawHealthBar(500f, 1600f, canvas, mwHeroHp, 124, MwHero.mwHeroHp, -38);
        
        canvas.drawBitmap(mwSlime, null, new RectF(MwMob.mwSlimeX, MwMob.mwSlimeY, MwMob.mwSlimeX + 100, MwMob.mwSlimeY + 100), null);
        canvas.drawBitmap(mwButtonUp, null, new RectF(300f, 1600f, 440f, 1740f), null);
        canvas.drawBitmap(mwButtonDown, null, new RectF(300f, 2000f, 440f, 2140f), null);
        canvas.drawBitmap(mwButtonLeft, null, new RectF(100f, 1800f, 240f, 1940f), null);
        canvas.drawBitmap(mwButtonRight, null, new RectF(500f, 1800f, 640f, 1940f), null);
        canvas.drawBitmap(mwButtonAttack, null, new RectF(750f, 1800f, 890f, 1940f), null);
        canvas.drawBitmap(mwJohnCard, null, new RectF(650f, 1900f, 1150f, 2400f), null);
        invalidate();
        }
    public boolean onTouchEvent(MotionEvent event) {

        // Detect click using x y z
        float xControll = event.getX();
        float yControll = event.getY();

        if (event.getAction() == MotionEvent.ACTION_DOWN) {

            if (xControll > 300f && xControll < 440f && yControll > 1600f && yControll < 1740f) {
                mwHero.mwHeroUp();
                    if(mwJohnAnimationRule == false){
                    mwJohnAnimationRule = true;
                    mHandler.postDelayed(mRunnable, 500);
                    new Thread(
                                    new Runnable() {
                                        @Override
                                        public void run() {
                                            while (mwJohnAnimationRule) {

                                                for (int i = 0; i < mwJohnWalkBitmaps.length; i++) {
                                                  if(mwJohnAnimationRule) {
                                                    currentFrame = i;
                                                    mwJohn = mwJohnWalkBitmaps[i];
                                                    try {
                                                        Thread.sleep(1000L / fps);
                                                    } catch (InterruptedException y) {
                                                        y.printStackTrace();
                                                    }
                                                  postInvalidate();
                                                  }
                                                }
                                            }
                                        }
                                    })
                            .start();
                    }
                }
            if (xControll > 300f && xControll < 440f && yControll > 2000f && yControll < 2140f) {
                mwHero.mwHeroDown();
                if(mwJohnAnimationRule == false){
                    mwJohnAnimationRule = true;
                    mHandler.postDelayed(mRunnable, 500);
                    new Thread(
                                    new Runnable() {
                                        @Override
                                        public void run() {
                                            while (mwJohnAnimationRule) {

                                                for (int i = 0; i < mwJohnWalkBitmaps.length; i++) {
                                                  if(mwJohnAnimationRule) {
                                                    currentFrame = i;
                                                    mwJohn = mwJohnWalkBitmaps[i];
                                                    try {
                                                        Thread.sleep(1000L / fps);
                                                    } catch (InterruptedException y) {
                                                        y.printStackTrace();
                                                    }
                                                  postInvalidate();
                                                  }
                                                }
                                            }
                                        }
                                    })
                            .start();
                    }
            }
            if (xControll > 100f && xControll < 240f && yControll > 1800f && yControll < 1940f) {
                mwHero.mwHeroLeft();
                if(mwJohnAnimationRule == false){
                    mwJohnAnimationRule = true;
                    mHandler.postDelayed(mRunnable, 500);
                    new Thread(
                                    new Runnable() {
                                        @Override
                                        public void run() {
                                            while (mwJohnAnimationRule) {

                                                for (int i = 0; i < mwJohnWalkBitmaps.length; i++) {
                                                  if(mwJohnAnimationRule) {
                                                    currentFrame = i;
                                                    mwJohn = mwJohnWalkBitmaps[i];
                                                    try {
                                                        Thread.sleep(1000L / fps);
                                                    } catch (InterruptedException y) {
                                                        y.printStackTrace();
                                                    }
                                                  postInvalidate();
                                                  }
                                                }
                                            }
                                        }
                                    })
                            .start();
                    }
            }
            if (xControll > 500f && xControll < 640f && yControll > 1800f && yControll < 1940f) {
                mwHero.mwHeroRight();
                if(mwJohnAnimationRule == false){
                    mwJohnAnimationRule = true;
                    mHandler.postDelayed(mRunnable, 500);
                    new Thread(
                                    new Runnable() {
                                        @Override
                                        public void run() {
                                            while (mwJohnAnimationRule) {

                                                for (int i = 0; i < mwJohnWalkBitmaps.length; i++) {
                                                  if(mwJohnAnimationRule) {
                                                    currentFrame = i;
                                                    mwJohn = mwJohnWalkBitmaps[i];
                                                    try {
                                                        Thread.sleep(1000L / fps);
                                                    } catch (InterruptedException y) {
                                                        y.printStackTrace();
                                                    }
                                                  postInvalidate();
                                                  }
                                                }
                                            }
                                        }
                                    })
                            .start();
                    }
            }
            if (xControll > 750f && xControll < 890f && yControll > 1800f && yControll < 1940f) {
              if(mwHeroAttackRule == false){
                mwHeroAttackRule = true;    
                mHandler.postDelayed(mRunnable, 500);
                new Thread(
                                new Runnable() {
                                    @Override
                                    public void run() {

                                        while (mwHeroAttackRule) {
                                            for (int a = 0; a < mwJohnAttackBitmaps.length; a++) {
                                              if(mwHeroAttackRule){
                                                currentFrame = a;
                                                mwJohn = mwJohnAttackBitmaps[a];
                                                try {
                                                    Thread.sleep(1000L / fps);
                                                } catch (InterruptedException e) {
                                                    e.printStackTrace();
                                                }
                                            }
                                            postInvalidate();
                                            }
                                        }
                                    }
                                })
                        .start();
                    }

                if (mwHero.getCollisionRect().CollidesWith(mwMob.getCollisionRect())) {
                    MwHero.mwHeroY += 20;
                    MwMob.mwSlimeY -= 10;
                    MwMob.mwSlimeHp -= 1;
                }
            }
        }
        if (event.getAction() == MotionEvent.ACTION_UP) {
            mHandler.removeCallbacks(mRunnable);
            mwJohnAnimationRule = false;
            mwHeroAttackRule = false;
        }
        return super.onTouchEvent(event);
    }
}
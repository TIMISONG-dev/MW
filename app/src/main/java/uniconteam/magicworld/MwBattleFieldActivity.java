package uniconteam.magicworld;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.graphics.RectF;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ThreadLocalRandom;
import androidx.appcompat.app.AppCompatActivity;


public class MwBattleFieldActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new MwBattleFieldMap(this));
        if (Build.VERSION.SDK_INT >= 21) {
            getWindow().setNavigationBarColor(Color.parseColor("#2C6E3C"));
        }
    }
}
class MwBattleFieldMap extends View{
    
	// All objects
    public Bitmap mwJohn; // John hero image
    public Bitmap mwSlime; // Slime image
    public Bitmap mwTikvach; // Tikvach image
    private Bitmap mwButtonUp; // Buttons 1-4 \/
    private Bitmap mwButtonDown;
    private Bitmap mwButtonLeft;
    private Bitmap mwButtonRight;
    private Bitmap mwHeroHp1; // Hero hp
    private Bitmap mwHeroHp2; // Hero hp
    private Bitmap mwHeroHp3; // Hero hp
    private Bitmap mwHeroHp4; // Hero hp
    private Bitmap mwHeroHp5; // Hero hp
    private Bitmap mwHeroHp6; // Hero hp
    private Bitmap mwMobHp1; // Mob hp
    private Bitmap mwMobHp2; // Mob hp
    private Bitmap mwMobHp3; // Mob hp
    private Bitmap mwMobHp4; // Mob hp
    private Bitmap mwMobHp5; // Mob hp
    private Bitmap mwMobHp6; // Mob hp
    private Bitmap mwHeroItem; // Hero item
    private Bitmap mwButtonAttack; // Hero attack button
    private String mwBiome = "landscape"; // Which background color #2C6E3C
    private Timer mwTimer = new Timer();
    private TimerTask mwTimerTask;
    public int currentFrame = 0;
    public int fps = 9;
    private int mwTouchTime = 0;
    public int mwCanvasX;
    public int mwCanvasY;
    public int mwMobTimer = 0;
    public int mwMobSpawnX = 0;
    public int mwMobSpawnY = 0;
    public boolean mwMobSpawnRule = true;
    public boolean mwJohnAnimationRule = false;
    public boolean mwHeroAttackRule = false;
    
    public Handler mHandler;
    public Runnable mRunnable;

    MwMob mwMob = new MwMob();
    MwHero mwHero = new MwHero();
    MwConsortium mwConsortium = new MwConsortium();
    
    
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
        
        mwHeroHp1 = BitmapFactory.decodeResource(context.getResources(), R.drawable.magicworld_hero_hp);
        mwHeroHp2 = BitmapFactory.decodeResource(context.getResources(), R.drawable.magicworld_hero_hp);
        mwHeroHp3 = BitmapFactory.decodeResource(context.getResources(), R.drawable.magicworld_hero_hp);
        mwHeroHp4 = BitmapFactory.decodeResource(context.getResources(), R.drawable.magicworld_hero_hp);
        mwHeroHp5 = BitmapFactory.decodeResource(context.getResources(), R.drawable.magicworld_hero_hp);
        mwHeroHp6 = BitmapFactory.decodeResource(context.getResources(), R.drawable.magicworld_hero_hp);
        
        mwMobHp1 = BitmapFactory.decodeResource(context.getResources(), R.drawable.magicworld_mob_hp);
        mwMobHp2 = BitmapFactory.decodeResource(context.getResources(), R.drawable.magicworld_mob_hp);
        mwMobHp3 = BitmapFactory.decodeResource(context.getResources(), R.drawable.magicworld_mob_hp);
        mwMobHp4 = BitmapFactory.decodeResource(context.getResources(), R.drawable.magicworld_mob_hp);
        mwMobHp5 = BitmapFactory.decodeResource(context.getResources(), R.drawable.magicworld_mob_hp);
        mwMobHp6 = BitmapFactory.decodeResource(context.getResources(), R.drawable.magicworld_mob_hp);
        
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
        
        
        
        if(mwMobTimer == 200){
            mwMob.mwSlimeRand();
            mwMobTimer += 1;
        } else {
            if(mwMobTimer < 200){ 
            mwMobTimer += 1;
            }
        }    
        
        if (mwBiome.equals("landscape")){
            canvas.drawColor(Color.parseColor("#2C6E3C"));
        }
        if (mwBiome.equals("desert")){
            canvas.drawColor(Color.parseColor("#2C6E3C"));
        }
        mwCanvasX = canvas.getWidth();
        mwCanvasY = canvas.getHeight();
       
        if(mwMobSpawnRule){
        mwMobSpawnRule = false;    
        mwMobSpawnX = ThreadLocalRandom.current().nextInt(100, mwCanvasX - 199);
        mwMobSpawnY = ThreadLocalRandom.current().nextInt(100, mwCanvasY - 199);
        MwMob.mwSlimeX = mwMobSpawnX;
        MwMob.mwSlimeZ = mwMobSpawnX+100;
        MwMob.mwSlimeY = mwMobSpawnY;
        MwMob.mwSlimeW = mwMobSpawnY+110;
        }
        
        
        // Debug
        paint.setColor(Color.WHITE); 
        canvas.drawPaint(paint); 
        paint.setColor(Color.BLACK); 
        paint.setTextSize(60); 
        canvas.drawText(String.valueOf(MwMob.mwSlimeY), 10, 135, paint);
        canvas.drawText(String.valueOf(MwMob.mwSlimeX), 250, 135, paint);
        canvas.drawText(String.valueOf(MwHero.mwHeroY), 10, 235, paint);
        canvas.drawText(String.valueOf(MwHero.mwHeroX), 250, 235, paint);
        canvas.drawText("Debug", 10, 55, paint);
        
        /*
        Paint rect_paint = new Paint();
        rect_paint.setStyle(Paint.Style.FILL);
        rect_paint.setColor(Color.rgb(0, 0, 0));
        rect_paint.setAlpha(0x80); // optional
        canvas.drawRect(0, 0, 100, 100, rect_paint);
        */
        BitmapFactory.Options opt = new BitmapFactory.Options();
        opt.inMutable = true;
        Bitmap brightBitmap = BitmapFactory.decodeResource(getResources(), R.drawable.magicworld_icon_coin, opt); 
        Canvas hero = new Canvas(brightBitmap);
        hero.drawBitmap(mwJohn, null, new RectF(MwHero.mwHeroX, MwHero.mwHeroY, MwHero.mwHeroZ, MwHero.mwHeroW), null);
        canvas.drawBitmap(mwJohn, null, new RectF(MwHero.mwHeroX, MwHero.mwHeroY, MwHero.mwHeroZ, MwHero.mwHeroW), null);
        
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
                MwHero.mwHeroY += 10;
                MwHero.mwHeroW += 10;
                MwMob.mwSlimeY -= 10;
                MwMob.mwSlimeW -= 10;
                MwHero.mwHeroHp -= 1;
            }
        }
        
        // Hp for slime
        if(MwMob.mwSlimeHp == 6){
        canvas.drawBitmap(mwMobHp1, null, new RectF(MwMob.mwSlimeX+200, MwMob.mwSlimeY-30, MwMob.mwSlimeZ+250, MwMob.mwSlimeW+10), null);
        canvas.drawBitmap(mwMobHp2, null, new RectF(MwMob.mwSlimeX+250, MwMob.mwSlimeY-30, MwMob.mwSlimeZ+300, MwMob.mwSlimeW+10), null);
        canvas.drawBitmap(mwMobHp3, null, new RectF(MwMob.mwSlimeX+300, MwMob.mwSlimeY-30, MwMob.mwSlimeZ+350, MwMob.mwSlimeW+10), null);
        canvas.drawBitmap(mwMobHp4, null, new RectF(MwMob.mwSlimeX+350, MwMob.mwSlimeY-30, MwMob.mwSlimeZ+400, MwMob.mwSlimeW+10), null);
        canvas.drawBitmap(mwMobHp5, null, new RectF(MwMob.mwSlimeX+400, MwMob.mwSlimeY-30, MwMob.mwSlimeZ+450, MwMob.mwSlimeW+10), null);
        canvas.drawBitmap(mwMobHp6, null, new RectF(MwMob.mwSlimeX+450, MwMob.mwSlimeY-30, MwMob.mwSlimeZ+500, MwMob.mwSlimeW+10), null);     
        } else {
            if(MwMob.mwSlimeHp == 5){
               canvas.drawBitmap(mwMobHp1, null, new RectF(MwMob.mwSlimeX+200, MwMob.mwSlimeY-30, MwMob.mwSlimeZ+260, MwMob.mwSlimeW+10), null);
               canvas.drawBitmap(mwMobHp2, null, new RectF(MwMob.mwSlimeX+250, MwMob.mwSlimeY-30, MwMob.mwSlimeZ+310, MwMob.mwSlimeW+10), null);
               canvas.drawBitmap(mwMobHp3, null, new RectF(MwMob.mwSlimeX+300, MwMob.mwSlimeY-30, MwMob.mwSlimeZ+350, MwMob.mwSlimeW+10), null);
               canvas.drawBitmap(mwMobHp4, null, new RectF(MwMob.mwSlimeX+350, MwMob.mwSlimeY-30, MwMob.mwSlimeZ+390, MwMob.mwSlimeW+10), null);
               canvas.drawBitmap(mwMobHp5, null, new RectF(MwMob.mwSlimeX+400, MwMob.mwSlimeY-30, MwMob.mwSlimeZ+430, MwMob.mwSlimeW+10), null); 
                } else {
                    if(MwMob.mwSlimeHp == 4){
                   canvas.drawBitmap(mwMobHp1, null, new RectF(MwMob.mwSlimeX+200, MwMob.mwSlimeY-30, MwMob.mwSlimeZ+260, MwMob.mwSlimeW+10), null);
                   canvas.drawBitmap(mwMobHp2, null, new RectF(MwMob.mwSlimeX+250, MwMob.mwSlimeY-30, MwMob.mwSlimeZ+310, MwMob.mwSlimeW+10), null);
                   canvas.drawBitmap(mwMobHp3, null, new RectF(MwMob.mwSlimeX+300, MwMob.mwSlimeY-30, MwMob.mwSlimeZ+350, MwMob.mwSlimeW+10), null);
                   canvas.drawBitmap(mwMobHp4, null, new RectF(MwMob.mwSlimeX+350, MwMob.mwSlimeY-30, MwMob.mwSlimeZ+390, MwMob.mwSlimeW+10), null);
                   } else {
                       if(MwMob.mwSlimeHp == 3){
                      canvas.drawBitmap(mwMobHp1, null, new RectF(MwMob.mwSlimeX+200, MwMob.mwSlimeY-30, MwMob.mwSlimeZ+260, MwMob.mwSlimeW+10), null);
                      canvas.drawBitmap(mwMobHp2, null, new RectF(MwMob.mwSlimeX+250, MwMob.mwSlimeY-30, MwMob.mwSlimeZ+310, MwMob.mwSlimeW+10), null);
                      canvas.drawBitmap(mwMobHp3, null, new RectF(MwMob.mwSlimeX+300, MwMob.mwSlimeY-30, MwMob.mwSlimeZ+350, MwMob.mwSlimeW+10), null);
                     } else {
                          if(MwMob.mwSlimeHp == 2){
                            canvas.drawBitmap(mwMobHp1, null, new RectF(MwMob.mwSlimeX+200, MwMob.mwSlimeY-30, MwMob.mwSlimeZ+260, MwMob.mwSlimeW+10), null);
                            canvas.drawBitmap(mwMobHp2, null, new RectF(MwMob.mwSlimeX+250, MwMob.mwSlimeY-30, MwMob.mwSlimeZ+310, MwMob.mwSlimeW+10), null);
                         } else {
                             if(MwMob.mwSlimeHp == 1){
                             canvas.drawBitmap(mwMobHp1, null, new RectF(MwMob.mwSlimeX+200, MwMob.mwSlimeY-30, MwMob.mwSlimeZ+260, MwMob.mwSlimeW+10), null);
                                MwMob.mwSlimeX = 12000;
                                MwMob.mwSlimeY = 12000;
                                MwMob.mwSlimeW = 12000;
                                MwMob.mwSlimeZ = 12000;
                             }
                         }
                     }
                   }
                }
        }
        
        
        
        // Hp for hero
            if (MwHero.mwHeroHp == 6) {
                canvas.drawBitmap(mwHeroHp1, null, new RectF(500f, 1600f, 640f, 1740f), null);
                canvas.drawBitmap(mwHeroHp2, null, new RectF(550f, 1600f, 690f, 1740f), null);
                canvas.drawBitmap(mwHeroHp3, null, new RectF(600f, 1600f, 740f, 1740f), null);
                canvas.drawBitmap(mwHeroHp4, null, new RectF(650f, 1600f, 790f, 1740f), null);
                canvas.drawBitmap(mwHeroHp5, null, new RectF(700f, 1600f, 840f, 1740f), null);
                canvas.drawBitmap(mwHeroHp6, null, new RectF(750f, 1600f, 890f, 1740f), null);
            } else {
                if (MwHero.mwHeroHp == 5) {
                    canvas.drawBitmap(mwHeroHp1, null, new RectF(500f, 1600f, 640f, 1740f), null);
                    canvas.drawBitmap(mwHeroHp2, null, new RectF(550f, 1600f, 690f, 1740f), null);
                    canvas.drawBitmap(mwHeroHp3, null, new RectF(600f, 1600f, 740f, 1740f), null);
                    canvas.drawBitmap(mwHeroHp4, null, new RectF(650f, 1600f, 790f, 1740f), null);
                    canvas.drawBitmap(mwHeroHp5, null, new RectF(700f, 1600f, 840f, 1740f), null);
                } else {
                    if (MwHero.mwHeroHp == 4) {
                        canvas.drawBitmap(mwHeroHp1, null, new RectF(500f, 1600f, 640f, 1740f), null);
                        canvas.drawBitmap(mwHeroHp2, null, new RectF(550f, 1600f, 690f, 1740f), null);
                        canvas.drawBitmap(mwHeroHp3, null, new RectF(600f, 1600f, 740f, 1740f), null);
                        canvas.drawBitmap(mwHeroHp4, null, new RectF(650f, 1600f, 790f, 1740f), null);
                    } else {
                        if (MwHero.mwHeroHp == 3) {
                            canvas.drawBitmap(mwHeroHp1, null, new RectF(500f, 1600f, 640f, 1740f), null);
                            canvas.drawBitmap(mwHeroHp2, null, new RectF(550f, 1600f, 690f, 1740f), null);
                            canvas.drawBitmap(mwHeroHp3, null, new RectF(600f, 1600f, 740f, 1740f), null);
                        } else {
                            if (MwHero.mwHeroHp == 2) {
                                canvas.drawBitmap(mwHeroHp1, null, new RectF(500f, 1600f, 640f, 1740f), null);
                                canvas.drawBitmap(mwHeroHp2, null, new RectF(550f, 1600f, 690f, 1740f), null);
                            } else {
                                if (MwHero.mwHeroHp == 1) {
                                    canvas.drawBitmap(mwHeroHp1, null, new RectF(500f, 1600f, 640f, 1740f), null);
                                } else {
                                    MwHero.mwHeroX = 10000;
                                    MwHero.mwHeroZ = 10000;
                                    MwHero.mwHeroY = 10000;
                                    MwHero.mwHeroW = 10000;
                                }
                            }
                        }
                    }
                }
            }
        
        canvas.drawBitmap(mwSlime, null, new RectF(MwMob.mwSlimeX, MwMob.mwSlimeY, MwMob.mwSlimeZ, MwMob.mwSlimeW), null);
        canvas.drawBitmap(mwButtonUp, null, new RectF(300f, 1600f, 440f, 1740f), null);
        canvas.drawBitmap(mwButtonDown, null, new RectF(300f, 2000f, 440f, 2140f), null);
        canvas.drawBitmap(mwButtonLeft, null, new RectF(100f, 1800f, 240f, 1940f), null);
        canvas.drawBitmap(mwButtonRight, null, new RectF(500f, 1800f, 640f, 1940f), null);
        canvas.drawBitmap(mwButtonAttack, null, new RectF(750f, 1800f, 890f, 1940f), null);
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
                    MwHero.mwHeroW += 20;
                    MwMob.mwSlimeY -= 10;
                    MwMob.mwSlimeW -= 10;
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
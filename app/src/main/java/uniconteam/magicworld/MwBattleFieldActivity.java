package uniconteam.magicworld;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Build;
import android.os.Bundle;
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
    
    
    MwHero mwHero = new MwHero();
    MwMob mwMob = new MwMob();
    
    
    // Array animation john and slime
    Bitmap[] mwJohnBitmaps = new Bitmap[]{ BitmapFactory.decodeResource(getResources(), R.drawable.magicworld_hero_john_animation_1), BitmapFactory.decodeResource(getResources(), R.drawable.magicworld_hero_john_animation_2), BitmapFactory.decodeResource(getResources(), R.drawable.magicworld_hero_john_animation_3),};
    Bitmap[] mwSlimeBitmaps = new Bitmap[]{ BitmapFactory.decodeResource(getResources(), R.drawable.magicworld_mob_slime_animation_walk_1), BitmapFactory.decodeResource(getResources(), R.drawable.magicworld_mob_slime_animation_walk_2), BitmapFactory.decodeResource(getResources(), R.drawable.magicworld_mob_slime_animation_walk_3),};
    Bitmap[] mwTikvachBitmaps = new Bitmap[]{ BitmapFactory.decodeResource(getResources(), R.drawable.magicworld_mob_tikvach_animation_walk_1), BitmapFactory.decodeResource(getResources(), R.drawable.magicworld_mob_tikvach_animation_walk_2), BitmapFactory.decodeResource(getResources(), R.drawable.magicworld_mob_tikvach_animation_walk_3),};
    
	public MwBattleFieldMap (Context context){
		super(context);
    
        
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
        
        
        new Thread(new Runnable() { 
        @Override
                public void run() {
            while(true) {
                for(int i = 0; i < mwJohnBitmaps.length; i++) {
                    currentFrame = i;
                           mwJohn = mwJohnBitmaps[i];
                    try {
                        Thread.sleep(1000L / fps);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        } } ).start();
        
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
    
public boolean onTouchEvent(MotionEvent event){
        
        // Detect click using x y z
       float xControll = event.getX();
       float yControll = event.getY();
        
    if(event.getAction() == MotionEvent.ACTION_DOWN)
        
        
       if(xControll > 300f && xControll < 440f && yControll > 1600f && yControll < 1740f)
        {
            mwHero.mwHeroY -= 30;
            mwHero.mwHeroW -= 30;
        }
        if(xControll > 300f && xControll < 440f && yControll > 2000f && yControll < 2140f)
        {
            mwHero.mwHeroY += 30;
            mwHero.mwHeroW += 30;
        }
        if(xControll > 100f && xControll < 240f && yControll > 1800f && yControll < 1940f)
        {
            mwHero.mwHeroX -= 30;
            mwHero.mwHeroZ -= 30;
        }
        if(xControll > 500f && xControll < 640f && yControll > 1800f && yControll < 1940f)
        {
            mwHero.mwHeroX += 30;
            mwHero.mwHeroZ += 30;
        }
    return super.onTouchEvent(event);
}
    
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
        mwMob.mwSlimeX = mwMobSpawnX;
        mwMob.mwSlimeZ = mwMobSpawnX+100;
        mwMob.mwSlimeY = mwMobSpawnY;
        mwMob.mwSlimeW = mwMobSpawnY+110;
        }
        
        // not collision
        
        /*
        if(mwHero.mwHeroHp != 0){
        if ((mwHero.mwHeroY == mwMob.mwSlimeY + 70 || mwHero.mwHeroY == mwMob.mwSlimeY + 71 ||mwHero.mwHeroY == mwMob.mwSlimeY + 72 ||mwHero.mwHeroY == mwMob.mwSlimeY + 73 || mwHero.mwHeroY == mwMob.mwSlimeY + 74 || mwHero.mwHeroY == mwMob.mwSlimeY + 75 || mwHero.mwHeroY == mwMob.mwSlimeY + 76 || mwHero.mwHeroY == mwMob.mwSlimeY + 77 || mwHero.mwHeroY == mwMob.mwSlimeY + 78 || mwHero.mwHeroY == mwMob.mwSlimeY + 79 || mwHero.mwHeroY == mwMob.mwSlimeY + 80 || mwHero.mwHeroY == mwMob.mwSlimeY + 81 || mwHero.mwHeroY == mwMob.mwSlimeY + 82 || mwHero.mwHeroY == mwMob.mwSlimeY + 83 || mwHero.mwHeroY == mwMob.mwSlimeY + 84 || mwHero.mwHeroY == mwMob.mwSlimeY + 85 || mwHero.mwHeroY == mwMob.mwSlimeY + 86 || mwHero.mwHeroY == mwMob.mwSlimeY + 87 || mwHero.mwHeroY == mwMob.mwSlimeY + 88 || mwHero.mwHeroY == mwMob.mwSlimeY + 89 || mwHero.mwHeroY == mwMob.mwSlimeY + 90 || mwHero.mwHeroY == mwMob.mwSlimeY + 91 || mwHero.mwHeroY == mwMob.mwSlimeY + 92 || mwHero.mwHeroY == mwMob.mwSlimeY + 93 || mwHero.mwHeroY == mwMob.mwSlimeY + 94 || mwHero.mwHeroY == mwMob.mwSlimeY + 95 || mwHero.mwHeroY == mwMob.mwSlimeY + 96 || mwHero.mwHeroY == mwMob.mwSlimeY + 97)){
            mwHero.mwHeroHp -= 1;
            mwHero.mwHeroY += 100;
            mwHero.mwHeroW += 100;        
            mwMob.mwSlimeY += 50;
            mwMob.mwSlimeW += 50;
          }
        } */
        
        // Debug
        paint.setColor(Color.WHITE); 
        canvas.drawPaint(paint); 
        paint.setColor(Color.BLACK); 
        paint.setTextSize(60); 
        canvas.drawText(String.valueOf(mwMob.mwSlimeY), 10, 135, paint);
        canvas.drawText(String.valueOf(mwMob.mwSlimeX), 150, 135, paint);
        canvas.drawText(String.valueOf(mwHero.mwHeroY), 10, 235, paint);
        canvas.drawText(String.valueOf(mwHero.mwHeroX), 150, 235, paint);
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
        hero.drawBitmap(mwJohn, null, new RectF(mwHero.mwHeroX, mwHero.mwHeroY, mwHero.mwHeroZ, mwHero.mwHeroW), null);
        canvas.drawBitmap(mwJohn, null, new RectF(mwHero.mwHeroX, mwHero.mwHeroY, mwHero.mwHeroZ, mwHero.mwHeroW), null);
        
        // Tikvach
        canvas.drawBitmap(mwTikvach, null, new RectF(850f, 1900f, 990f, 2040f), null);
        
        if(mwHero.mwHeroX > mwCanvasX || mwHero.mwHeroX < -80){
            mwBiome = "desert";
        }
        if(mwHero.mwHeroY > mwCanvasY || mwHero.mwHeroY < -80){
            mwBiome = "landscape";
        }
        
        if(mwMob.mwSlimeX > mwCanvasX-300){
            mwMob.mwMobXUpAcept = false;
        } else {
            mwMob.mwMobXUpAcept = true;
        }
        if(mwMob.mwSlimeY > mwCanvasY-300){
            mwMob.mwMobYUpAcept = false;
        } else {
            mwMob.mwMobYUpAcept = true;
        }
        if(mwMob.mwSlimeX < -50){
            mwMob.mwMobXDownAcept = false;
        } else {
            mwMob.mwMobXDownAcept = true;
        }
        if(mwMob.mwSlimeY < -50){
            mwMob.mwMobYDownAcept = false;
        } else {
            mwMob.mwMobYDownAcept = true;
        }
        
        mwHero.MwHeroSpw();
        mwMob.MwSlimeSpw();
        
        
        if (mwHero.getCollisionRect().CollidesWith(mwMob.getCollisionRect())) {
                mwHero.mwHeroX = 1000;
        }
        
        // Hp for slime
        if(mwMob.mwMobHp == 6){
        canvas.drawBitmap(mwMobHp1, null, new RectF(mwMob.mwSlimeX+200, mwMob.mwSlimeY-30, mwMob.mwSlimeZ+250, mwMob.mwSlimeW+10), null);
        canvas.drawBitmap(mwMobHp2, null, new RectF(mwMob.mwSlimeX+250, mwMob.mwSlimeY-30, mwMob.mwSlimeZ+300, mwMob.mwSlimeW+10), null);
        canvas.drawBitmap(mwMobHp3, null, new RectF(mwMob.mwSlimeX+300, mwMob.mwSlimeY-30, mwMob.mwSlimeZ+350, mwMob.mwSlimeW+10), null);
        canvas.drawBitmap(mwMobHp4, null, new RectF(mwMob.mwSlimeX+350, mwMob.mwSlimeY-30, mwMob.mwSlimeZ+400, mwMob.mwSlimeW+10), null);
        canvas.drawBitmap(mwMobHp5, null, new RectF(mwMob.mwSlimeX+400, mwMob.mwSlimeY-30, mwMob.mwSlimeZ+450, mwMob.mwSlimeW+10), null);
        canvas.drawBitmap(mwMobHp6, null, new RectF(mwMob.mwSlimeX+450, mwMob.mwSlimeY-30, mwMob.mwSlimeZ+500, mwMob.mwSlimeW+10), null);     
        } else {
            if(mwMob.mwMobHp == 5){
               canvas.drawBitmap(mwMobHp1, null, new RectF(mwMob.mwSlimeX+200, mwMob.mwSlimeY-30, mwMob.mwSlimeZ+260, mwMob.mwSlimeW+10), null);
               canvas.drawBitmap(mwMobHp2, null, new RectF(mwMob.mwSlimeX+250, mwMob.mwSlimeY-30, mwMob.mwSlimeZ+310, mwMob.mwSlimeW+10), null);
               canvas.drawBitmap(mwMobHp3, null, new RectF(mwMob.mwSlimeX+300, mwMob.mwSlimeY-30, mwMob.mwSlimeZ+350, mwMob.mwSlimeW+10), null);
               canvas.drawBitmap(mwMobHp4, null, new RectF(mwMob.mwSlimeX+350, mwMob.mwSlimeY-30, mwMob.mwSlimeZ+390, mwMob.mwSlimeW+10), null);
               canvas.drawBitmap(mwMobHp5, null, new RectF(mwMob.mwSlimeX+400, mwMob.mwSlimeY-30, mwMob.mwSlimeZ+430, mwMob.mwSlimeW+10), null); 
                } else {
                    if(mwMob.mwMobHp == 4){
                   canvas.drawBitmap(mwMobHp1, null, new RectF(mwMob.mwSlimeX+200, mwMob.mwSlimeY-30, mwMob.mwSlimeZ+260, mwMob.mwSlimeW+10), null);
                   canvas.drawBitmap(mwMobHp2, null, new RectF(mwMob.mwSlimeX+250, mwMob.mwSlimeY-30, mwMob.mwSlimeZ+310, mwMob.mwSlimeW+10), null);
                   canvas.drawBitmap(mwMobHp3, null, new RectF(mwMob.mwSlimeX+300, mwMob.mwSlimeY-30, mwMob.mwSlimeZ+350, mwMob.mwSlimeW+10), null);
                   canvas.drawBitmap(mwMobHp4, null, new RectF(mwMob.mwSlimeX+350, mwMob.mwSlimeY-30, mwMob.mwSlimeZ+390, mwMob.mwSlimeW+10), null);
                   } else {
                       if(mwMob.mwMobHp == 3){
                      canvas.drawBitmap(mwMobHp1, null, new RectF(mwMob.mwSlimeX+200, mwMob.mwSlimeY-30, mwMob.mwSlimeZ+260, mwMob.mwSlimeW+10), null);
                      canvas.drawBitmap(mwMobHp2, null, new RectF(mwMob.mwSlimeX+250, mwMob.mwSlimeY-30, mwMob.mwSlimeZ+310, mwMob.mwSlimeW+10), null);
                      canvas.drawBitmap(mwMobHp3, null, new RectF(mwMob.mwSlimeX+300, mwMob.mwSlimeY-30, mwMob.mwSlimeZ+350, mwMob.mwSlimeW+10), null);
                     } else {
                          if(mwMob.mwMobHp == 2){
                            canvas.drawBitmap(mwMobHp1, null, new RectF(mwMob.mwSlimeX+200, mwMob.mwSlimeY-30, mwMob.mwSlimeZ+260, mwMob.mwSlimeW+10), null);
                            canvas.drawBitmap(mwMobHp2, null, new RectF(mwMob.mwSlimeX+250, mwMob.mwSlimeY-30, mwMob.mwSlimeZ+310, mwMob.mwSlimeW+10), null);
                         } else {
                             if(mwMob.mwMobHp == 1){
                             canvas.drawBitmap(mwMobHp1, null, new RectF(mwMob.mwSlimeX+200, mwMob.mwSlimeY-30, mwMob.mwSlimeZ+260, mwMob.mwSlimeW+10), null);
                             }
                         }
                     }
                   }
                }
        }
        
        
        
        // Hp for hero
            if (mwHero.mwHeroHp == 6) {
                canvas.drawBitmap(mwHeroHp1, null, new RectF(500f, 1600f, 640f, 1740f), null);
                canvas.drawBitmap(mwHeroHp2, null, new RectF(550f, 1600f, 690f, 1740f), null);
                canvas.drawBitmap(mwHeroHp3, null, new RectF(600f, 1600f, 740f, 1740f), null);
                canvas.drawBitmap(mwHeroHp4, null, new RectF(650f, 1600f, 790f, 1740f), null);
                canvas.drawBitmap(mwHeroHp5, null, new RectF(700f, 1600f, 840f, 1740f), null);
                canvas.drawBitmap(mwHeroHp6, null, new RectF(750f, 1600f, 890f, 1740f), null);
            } else {
                if (mwHero.mwHeroHp == 5) {
                    canvas.drawBitmap(mwHeroHp1, null, new RectF(500f, 1600f, 640f, 1740f), null);
                    canvas.drawBitmap(mwHeroHp2, null, new RectF(550f, 1600f, 690f, 1740f), null);
                    canvas.drawBitmap(mwHeroHp3, null, new RectF(600f, 1600f, 740f, 1740f), null);
                    canvas.drawBitmap(mwHeroHp4, null, new RectF(650f, 1600f, 790f, 1740f), null);
                    canvas.drawBitmap(mwHeroHp5, null, new RectF(700f, 1600f, 840f, 1740f), null);
                } else {
                    if (mwHero.mwHeroHp == 4) {
                        canvas.drawBitmap(mwHeroHp1, null, new RectF(500f, 1600f, 640f, 1740f), null);
                        canvas.drawBitmap(mwHeroHp2, null, new RectF(550f, 1600f, 690f, 1740f), null);
                        canvas.drawBitmap(mwHeroHp3, null, new RectF(600f, 1600f, 740f, 1740f), null);
                        canvas.drawBitmap(mwHeroHp4, null, new RectF(650f, 1600f, 790f, 1740f), null);
                    } else {
                        if (mwHero.mwHeroHp == 3) {
                            canvas.drawBitmap(mwHeroHp1, null, new RectF(500f, 1600f, 640f, 1740f), null);
                            canvas.drawBitmap(mwHeroHp2, null, new RectF(550f, 1600f, 690f, 1740f), null);
                            canvas.drawBitmap(mwHeroHp3, null, new RectF(600f, 1600f, 740f, 1740f), null);
                        } else {
                            if (mwHero.mwHeroHp == 2) {
                                canvas.drawBitmap(mwHeroHp1, null, new RectF(500f, 1600f, 640f, 1740f), null);
                                canvas.drawBitmap(mwHeroHp2, null, new RectF(550f, 1600f, 690f, 1740f), null);
                            } else {
                                if (mwHero.mwHeroHp == 1) {
                                    canvas.drawBitmap(mwHeroHp1, null, new RectF(500f, 1600f, 640f, 1740f), null);
                                } else {
                                    mwHero.mwHeroX = 10000;
                                    mwHero.mwHeroZ = 10000;
                                    mwHero.mwHeroY = 10000;
                                    mwHero.mwHeroW = 10000;
                                }
                            }
                        }
                    }
                }
            }
        
        canvas.drawBitmap(mwSlime, null, new RectF(mwMob.mwSlimeX, mwMob.mwSlimeY, mwMob.mwSlimeZ, mwMob.mwSlimeW), null);
        canvas.drawBitmap(mwButtonUp, null, new RectF(300f, 1600f, 440f, 1740f), null);
        canvas.drawBitmap(mwButtonDown, null, new RectF(300f, 2000f, 440f, 2140f), null);
        canvas.drawBitmap(mwButtonLeft, null, new RectF(100f, 1800f, 240f, 1940f), null);
        canvas.drawBitmap(mwButtonRight, null, new RectF(500f, 1800f, 640f, 1940f), null);
        canvas.drawBitmap(mwButtonAttack, null, new RectF(750f, 1800f, 890f, 1940f), null);
        invalidate();
        }
}
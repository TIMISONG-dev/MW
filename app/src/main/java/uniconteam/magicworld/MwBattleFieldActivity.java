package uniconteam.magicworld;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorSpace;
import android.graphics.Paint;
import android.graphics.fonts.FontStyle;
import android.os.Bundle;
import android.text.style.StyleSpan;
import android.view.MotionEvent;
import android.view.View;
import android.graphics.Rect;
import android.graphics.RectF;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.Timer;
import java.util.TimerTask;
import uniconteam.magicworld.MwBattleFieldActivity;
import androidx.appcompat.app.AppCompatActivity;
import uniconteam.magicworld.MwPlayMainActivity;


public class MwBattleFieldActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new MwBattleFieldMap(this));
    }
}
class MwBattleFieldMap extends View{
	// all objects
	private String mwEG = "v0.1a";
    private Bitmap mwJohnBitmap; // John hero image
    private Bitmap mwSlimeBitmap; // Slime image
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
    int currentFrame = 0;
    int fps = 9;
    int mwHeroX = 100;
    int mwHeroY = 1100;
    int mwHeroZ = 200;
    int mwHeroW = 1200;
    int mwSlimeX = 100;
    int mwSlimeY = 110;
    int mwSlimeZ = 200;
    int mwSlimeW = 210;
    int mwHeroHp = 6;
    int mwMobHp = 6;
    
    // Array animation john and slime
    Bitmap[] mwJohnBitmaps = new Bitmap[]{ BitmapFactory.decodeResource(getResources(), R.drawable.magicworld_hero_john_animation_1), BitmapFactory.decodeResource(getResources(), R.drawable.magicworld_hero_john_animation_2), BitmapFactory.decodeResource(getResources(), R.drawable.magicworld_hero_john_animation_3),};
    Bitmap[] mwSlimeBitmaps = new Bitmap[]{ BitmapFactory.decodeResource(getResources(), R.drawable.magicworld_mob_slime_animation_walk_3), BitmapFactory.decodeResource(getResources(), R.drawable.magicworld_mob_slime_animation_walk_4), BitmapFactory.decodeResource(getResources(), R.drawable.magicworld_mob_slime_animation_walk_5),};
    
	public MwBattleFieldMap (Context context){
		super(context);
        // draw objects
        mwButtonUp = BitmapFactory.decodeResource(context.getResources(), R.drawable.magicworld_button_up);
        mwButtonDown = BitmapFactory.decodeResource(context.getResources(), R.drawable.magicworld_button_down);
        mwButtonRight = BitmapFactory.decodeResource(context.getResources(), R.drawable.magicworld_button_right);
        mwButtonLeft = BitmapFactory.decodeResource(context.getResources(), R.drawable.magicworld_button_left);
        mwHeroItem = BitmapFactory.decodeResource(context.getResources(), R.drawable.magicworld_hero_item);
        mwButtonAttack = BitmapFactory.decodeResource(context.getResources(), R.drawable.magicworld_button_attack);
         if(mwHeroHp == 6){
        mwHeroHp1 = BitmapFactory.decodeResource(context.getResources(), R.drawable.magicworld_hero_hp);
        mwHeroHp2 = BitmapFactory.decodeResource(context.getResources(), R.drawable.magicworld_hero_hp);
        mwHeroHp3 = BitmapFactory.decodeResource(context.getResources(), R.drawable.magicworld_hero_hp);
        mwHeroHp4 = BitmapFactory.decodeResource(context.getResources(), R.drawable.magicworld_hero_hp);
        mwHeroHp5 = BitmapFactory.decodeResource(context.getResources(), R.drawable.magicworld_hero_hp);
        mwHeroHp6 = BitmapFactory.decodeResource(context.getResources(), R.drawable.magicworld_hero_hp);
        } else {
            if(mwHeroHp == 5){
        mwHeroHp1 = BitmapFactory.decodeResource(context.getResources(), R.drawable.magicworld_hero_hp);
        mwHeroHp2 = BitmapFactory.decodeResource(context.getResources(), R.drawable.magicworld_hero_hp);
        mwHeroHp3 = BitmapFactory.decodeResource(context.getResources(), R.drawable.magicworld_hero_hp);
        mwHeroHp4 = BitmapFactory.decodeResource(context.getResources(), R.drawable.magicworld_hero_hp);
        mwHeroHp5 = BitmapFactory.decodeResource(context.getResources(), R.drawable.magicworld_hero_hp);
                } else {
                    if(mwHeroHp == 4){
               mwHeroHp1 = BitmapFactory.decodeResource(context.getResources(), R.drawable.magicworld_hero_hp);
               mwHeroHp2 = BitmapFactory.decodeResource(context.getResources(), R.drawable.magicworld_hero_hp);
               mwHeroHp3 = BitmapFactory.decodeResource(context.getResources(), R.drawable.magicworld_hero_hp);
               mwHeroHp4 = BitmapFactory.decodeResource(context.getResources(), R.drawable.magicworld_hero_hp);
                   } else {
                       if(mwHeroHp == 3){
                  mwHeroHp1 = BitmapFactory.decodeResource(context.getResources(), R.drawable.magicworld_hero_hp);
                  mwHeroHp2 = BitmapFactory.decodeResource(context.getResources(), R.drawable.magicworld_hero_hp);
                  mwHeroHp3 = BitmapFactory.decodeResource(context.getResources(), R.drawable.magicworld_hero_hp);
                     } else {
                          if(mwHeroHp == 2){
                      mwHeroHp1 = BitmapFactory.decodeResource(context.getResources(), R.drawable.magicworld_hero_hp);
                      mwHeroHp2 = BitmapFactory.decodeResource(context.getResources(), R.drawable.magicworld_hero_hp);
                         } else {
                             if(mwHeroHp == 1){
                        mwHeroHp1 = BitmapFactory.decodeResource(context.getResources(), R.drawable.magicworld_hero_hp);
                             } 
                         }
                     }
                   }
                }
        }
        if(mwMobHp == 6){
        mwMobHp1 = BitmapFactory.decodeResource(context.getResources(), R.drawable.magicworld_mob_hp);
        mwMobHp2 = BitmapFactory.decodeResource(context.getResources(), R.drawable.magicworld_mob_hp);
        mwMobHp3 = BitmapFactory.decodeResource(context.getResources(), R.drawable.magicworld_mob_hp);
        mwMobHp4 = BitmapFactory.decodeResource(context.getResources(), R.drawable.magicworld_mob_hp);
        mwMobHp5 = BitmapFactory.decodeResource(context.getResources(), R.drawable.magicworld_mob_hp);
        mwMobHp6 = BitmapFactory.decodeResource(context.getResources(), R.drawable.magicworld_mob_hp);
        } else {
            if(mwMobHp == 5){
        mwMobHp1 = BitmapFactory.decodeResource(context.getResources(), R.drawable.magicworld_mob_hp);
        mwMobHp2 = BitmapFactory.decodeResource(context.getResources(), R.drawable.magicworld_mob_hp);
        mwMobHp3 = BitmapFactory.decodeResource(context.getResources(), R.drawable.magicworld_mob_hp);
        mwMobHp4 = BitmapFactory.decodeResource(context.getResources(), R.drawable.magicworld_mob_hp);
        mwMobHp5 = BitmapFactory.decodeResource(context.getResources(), R.drawable.magicworld_mob_hp);
                } else {
                    if(mwMobHp == 4){
               mwMobHp1 = BitmapFactory.decodeResource(context.getResources(), R.drawable.magicworld_mob_hp);
               mwMobHp2 = BitmapFactory.decodeResource(context.getResources(), R.drawable.magicworld_mob_hp);
               mwMobHp3 = BitmapFactory.decodeResource(context.getResources(), R.drawable.magicworld_mob_hp);
               mwMobHp4 = BitmapFactory.decodeResource(context.getResources(), R.drawable.magicworld_mob_hp);
                   } else {
                       if(mwMobHp == 3){
                  mwMobHp1 = BitmapFactory.decodeResource(context.getResources(), R.drawable.magicworld_mob_hp);
                  mwMobHp2 = BitmapFactory.decodeResource(context.getResources(), R.drawable.magicworld_mob_hp);
                  mwMobHp3 = BitmapFactory.decodeResource(context.getResources(), R.drawable.magicworld_mob_hp);
                     } else {
                          if(mwMobHp == 2){
                      mwMobHp1 = BitmapFactory.decodeResource(context.getResources(), R.drawable.magicworld_mob_hp);
                      mwMobHp2 = BitmapFactory.decodeResource(context.getResources(), R.drawable.magicworld_mob_hp);
                         } else {
                             if(mwMobHp == 1){
                        mwMobHp1 = BitmapFactory.decodeResource(context.getResources(), R.drawable.magicworld_mob_hp);
                             } 
                         }
                     }
                   }
                }
        }
        
        new Thread( new Runnable() { 
        @Override
                public void run() {
            while(true) {
                for(int i = 0; i < mwJohnBitmaps.length; i++) {
                    currentFrame = i;
                           mwJohnBitmap = mwJohnBitmaps[i];
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
                        mwSlimeBitmap = mwSlimeBitmaps[j];
                    try{
                        Thread.sleep(1000L / fps);
                    } catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }
            }
        } } ).start();
      }
    
    @Override
public boolean onTouchEvent(MotionEvent event)
{
    // detect click using x y z
    float xControll = event.getX();
    float yControll = event.getY();
    switch(event.getAction())
        
    {
        case MotionEvent.ACTION_DOWN:
        if(xControll > 300f && xControll < 440f && yControll > 1600f && yControll < 1740f)
        {
                mwHeroY -= 40;
                mwHeroW -= 40;
        }
        if(xControll > 300f && xControll < 440f && yControll > 2000f && yControll < 2140f)
        {
                mwHeroY += 40;
                mwHeroW += 40;
        }
        if(xControll > 100f && xControll < 240f && yControll > 1800f && yControll < 1940f)
        {
                mwHeroX -= 40;
                mwHeroZ -= 40;
        }
        if(xControll > 500f && xControll < 640f && yControll > 1800f && yControll < 1940f)
        {
                mwHeroX += 40;
                mwHeroZ += 40;
        }
        return true;
    }
    return false;
  }
	@Override
	protected void onDraw(Canvas canvas) {
		super.onDraw(canvas);
        // actions on click x y z
        // canvas.drawBitmap(BitmapFactory.decodeResource(getResources(),R.drawable.magicworld_block_grass),0,0,null);
        if (mwBiome.equals("landscape")){
            canvas.drawColor(Color.parseColor("#2C6E3C"));
        }
        if (mwBiome.equals("desert")){
            canvas.drawColor(Color.parseColor("#2C6E3C"));
        }
        if ((mwHeroY == mwSlimeY + 10 || mwHeroY == mwSlimeY + 20 || mwHeroY == mwSlimeY+30 || mwHeroY == mwSlimeY+40 || mwHeroY == mwSlimeY+50 || mwHeroY == mwSlimeY+60 || mwHeroY == mwSlimeY+70)) {
        mwHeroHp -= 1;
            mwHeroY += 100;
            mwHeroW += 100;
            mwSlimeY += 50;
            mwSlimeW += 50;
        }
        Paint paint = new Paint();
        paint.setColor(Color.WHITE); 
        canvas.drawPaint(paint); 
        paint.setColor(Color.BLACK); 
        paint.setTextSize(60); 
        canvas.drawText(String.valueOf(fps), 10, 55, paint);
        canvas.drawBitmap(mwButtonUp, null, new RectF(300f, 1600f, 440f, 1740f), null);
        canvas.drawBitmap(mwButtonDown, null, new RectF(300f, 2000f, 440f, 2140f), null);
        canvas.drawBitmap(mwButtonLeft, null, new RectF(100f, 1800f, 240f, 1940f), null);
        canvas.drawBitmap(mwButtonRight, null, new RectF(500f, 1800f, 640f, 1940f), null);
        canvas.drawBitmap(mwHeroItem, null, new RectF(500f, 2000f, 640f, 2140f), null);
        canvas.drawBitmap(mwButtonAttack, null, new RectF(750f, 1800f, 890f, 1940f), null);
        if(mwHeroHp == 6){
        canvas.drawBitmap(mwHeroHp1, null, new RectF(500f, 1600f, 640f, 1740f), null);
        canvas.drawBitmap(mwHeroHp2, null, new RectF(550f, 1600f, 690f, 1740f), null);
        canvas.drawBitmap(mwHeroHp3, null, new RectF(600f, 1600f, 740f, 1740f), null);
        canvas.drawBitmap(mwHeroHp4, null, new RectF(650f, 1600f, 790f, 1740f), null);
        canvas.drawBitmap(mwHeroHp5, null, new RectF(700f, 1600f, 840f, 1740f), null);
        canvas.drawBitmap(mwHeroHp6, null, new RectF(750f, 1600f, 890f, 1740f), null);
        canvas.drawBitmap(mwJohnBitmap, null, new RectF(mwHeroX, mwHeroY, mwHeroZ, mwHeroW), null);    
        } else {
            if(mwHeroHp == 5){
               canvas.drawBitmap(mwHeroHp1, null, new RectF(500f, 1600f, 640f, 1740f), null);
               canvas.drawBitmap(mwHeroHp2, null, new RectF(550f, 1600f, 690f, 1740f), null);
               canvas.drawBitmap(mwHeroHp3, null, new RectF(600f, 1600f, 740f, 1740f), null);
               canvas.drawBitmap(mwHeroHp4, null, new RectF(650f, 1600f, 790f, 1740f), null);
               canvas.drawBitmap(mwHeroHp5, null, new RectF(700f, 1600f, 840f, 1740f), null);
               canvas.drawBitmap(mwJohnBitmap, null, new RectF(mwHeroX, mwHeroY, mwHeroZ, mwHeroW), null);
                } else {
                    if(mwHeroHp == 4){
                   canvas.drawBitmap(mwHeroHp1, null, new RectF(500f, 1600f, 640f, 1740f), null);
                   canvas.drawBitmap(mwHeroHp2, null, new RectF(550f, 1600f, 690f, 1740f), null);
                   canvas.drawBitmap(mwHeroHp3, null, new RectF(600f, 1600f, 740f, 1740f), null);
                   canvas.drawBitmap(mwHeroHp4, null, new RectF(650f, 1600f, 790f, 1740f), null);
                   canvas.drawBitmap(mwJohnBitmap, null, new RectF(mwHeroX, mwHeroY, mwHeroZ, mwHeroW), null);
                   } else {
                       if(mwHeroHp == 3){
                     canvas.drawBitmap(mwHeroHp1, null, new RectF(500f, 1600f, 640f, 1740f), null);
                     canvas.drawBitmap(mwHeroHp2, null, new RectF(550f, 1600f, 690f, 1740f), null);
                     canvas.drawBitmap(mwHeroHp3, null, new RectF(600f, 1600f, 740f, 1740f), null);
                     canvas.drawBitmap(mwJohnBitmap, null, new RectF(mwHeroX, mwHeroY, mwHeroZ, mwHeroW), null);  
                     } else {
                          if(mwHeroHp == 2){
                            canvas.drawBitmap(mwHeroHp1, null, new RectF(500f, 1600f, 640f, 1740f), null);
                            canvas.drawBitmap(mwHeroHp2, null, new RectF(550f, 1600f, 690f, 1740f), null);
                            canvas.drawBitmap(mwJohnBitmap, null, new RectF(mwHeroX, mwHeroY, mwHeroZ, mwHeroW), null);
                         } else {
                             if(mwHeroHp == 1){
                             canvas.drawBitmap(mwHeroHp1, null, new RectF(500f, 1600f, 640f, 1740f), null);
                             canvas.drawBitmap(mwJohnBitmap, null, new RectF(mwHeroX, mwHeroY, mwHeroZ, mwHeroW), null);  
                             }
                         }
                     }
                   }
                }
        }
        if(mwMobHp == 6){
        canvas.drawBitmap(mwMobHp1, null, new RectF(mwSlimeX+200, mwSlimeY-30, mwSlimeZ+250, mwSlimeW+10), null);
        canvas.drawBitmap(mwMobHp2, null, new RectF(mwSlimeX+250, mwSlimeY-30, mwSlimeZ+300, mwSlimeW+10), null);
        canvas.drawBitmap(mwMobHp3, null, new RectF(mwSlimeX+300, mwSlimeY-30, mwSlimeZ+350, mwSlimeW+10), null);
        canvas.drawBitmap(mwMobHp4, null, new RectF(mwSlimeX+350, mwSlimeY-30, mwSlimeZ+400, mwSlimeW+10), null);
        canvas.drawBitmap(mwMobHp5, null, new RectF(mwSlimeX+400, mwSlimeY-30, mwSlimeZ+450, mwSlimeW+10), null);
        canvas.drawBitmap(mwMobHp6, null, new RectF(mwSlimeX+450, mwSlimeY-30, mwSlimeZ+500, mwSlimeW+10), null);     
        canvas.drawBitmap(mwSlimeBitmap, null, new RectF(mwSlimeX, mwSlimeY, mwSlimeZ, mwSlimeW), null); 
        } else {
            if(mwMobHp == 5){
               canvas.drawBitmap(mwMobHp1, null, new RectF(mwSlimeX+200, mwSlimeY-30, mwSlimeZ+260, mwSlimeW+10), null);
               canvas.drawBitmap(mwMobHp2, null, new RectF(mwSlimeX+250, mwSlimeY-30, mwSlimeZ+310, mwSlimeW+10), null);
               canvas.drawBitmap(mwMobHp3, null, new RectF(mwSlimeX+300, mwSlimeY-30, mwSlimeZ+350, mwSlimeW+10), null);
               canvas.drawBitmap(mwMobHp4, null, new RectF(mwSlimeX+350, mwSlimeY-30, mwSlimeZ+390, mwSlimeW+10), null);
               canvas.drawBitmap(mwMobHp5, null, new RectF(mwSlimeX+400, mwSlimeY-30, mwSlimeZ+430, mwSlimeW+10), null); 
               canvas.drawBitmap(mwSlimeBitmap, null, new RectF(mwSlimeX, mwSlimeY, mwSlimeZ, mwSlimeW), null);     
                } else {
                    if(mwMobHp == 4){
                   canvas.drawBitmap(mwMobHp1, null, new RectF(mwSlimeX+200, mwSlimeY-30, mwSlimeZ+260, mwSlimeW+10), null);
                   canvas.drawBitmap(mwMobHp2, null, new RectF(mwSlimeX+250, mwSlimeY-30, mwSlimeZ+310, mwSlimeW+10), null);
                   canvas.drawBitmap(mwMobHp3, null, new RectF(mwSlimeX+300, mwSlimeY-30, mwSlimeZ+350, mwSlimeW+10), null);
                   canvas.drawBitmap(mwMobHp4, null, new RectF(mwSlimeX+350, mwSlimeY-30, mwSlimeZ+390, mwSlimeW+10), null);
                   canvas.drawBitmap(mwSlimeBitmap, null, new RectF(mwSlimeX, mwSlimeY, mwSlimeZ, mwSlimeW), null);    
                   } else {
                       if(mwMobHp == 3){
                      canvas.drawBitmap(mwMobHp1, null, new RectF(mwSlimeX+200, mwSlimeY-30, mwSlimeZ+260, mwSlimeW+10), null);
                      canvas.drawBitmap(mwMobHp2, null, new RectF(mwSlimeX+250, mwSlimeY-30, mwSlimeZ+310, mwSlimeW+10), null);
                      canvas.drawBitmap(mwMobHp3, null, new RectF(mwSlimeX+300, mwSlimeY-30, mwSlimeZ+350, mwSlimeW+10), null);
                      canvas.drawBitmap(mwSlimeBitmap, null, new RectF(mwSlimeX, mwSlimeY, mwSlimeZ, mwSlimeW), null);    
                     } else {
                          if(mwMobHp == 2){
                            canvas.drawBitmap(mwMobHp1, null, new RectF(mwSlimeX+200, mwSlimeY-30, mwSlimeZ+260, mwSlimeW+10), null);
                            canvas.drawBitmap(mwMobHp2, null, new RectF(mwSlimeX+250, mwSlimeY-30, mwSlimeZ+310, mwSlimeW+10), null);
                            canvas.drawBitmap(mwSlimeBitmap, null, new RectF(mwSlimeX, mwSlimeY, mwSlimeZ, mwSlimeW), null);  
                         } else {
                             if(mwMobHp == 1){
                             canvas.drawBitmap(mwMobHp1, null, new RectF(mwSlimeX+200, mwSlimeY-30, mwSlimeZ+260, mwSlimeW+10), null);
                             canvas.drawBitmap(mwSlimeBitmap, null, new RectF(mwSlimeX, mwSlimeY, mwSlimeZ, mwSlimeW), null); 
                             }
                         }
                     }
                   }
                }
        }
        invalidate();
        }
}
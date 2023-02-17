package uniconteam.magicworld;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
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
    private Bitmap mwHeroHp; // Hero hp
    private Bitmap mwHeroItem; // Hero item
    private Bitmap mwButtonAttack; // Hero attack button
    private Timer mwTimer = new Timer();
    private TimerTask mwTimerTask;
    int currentFrame = 0;
    int fps = 9;
    int x = 0;
    int y = 0;
    
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
        mwHeroHp = BitmapFactory.decodeResource(context.getResources(), R.drawable.magicworld_hero_hp);
        mwHeroItem = BitmapFactory.decodeResource(context.getResources(), R.drawable.magicworld_hero_item);
        mwButtonAttack = BitmapFactory.decodeResource(context.getResources(), R.drawable.magicworld_button_attack);
        
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
                x -= 40;
        }
        if(xControll > 300f && xControll < 440f && yControll > 2000f && yControll < 2140f)
        {
                x += 40;
        }
        if(xControll > 100f && xControll < 240f && yControll > 1800f && yControll < 1940f)
        {
                y -= 40;
        }
        if(xControll > 500f && xControll < 640f && yControll > 1800f && yControll < 1940f)
        {
                y += 40;
        }
        return true;
    }
    return false;
  }
	@Override
	protected void onDraw(Canvas canvas) {
		super.onDraw(canvas);
        // actions on click x y z
        x = x;
        y = y;
        canvas.drawBitmap(mwJohnBitmap, null, new RectF(100f+y, 1100+x, 200f+y, (1200+x)), null);
        canvas.drawBitmap(mwSlimeBitmap, null, new RectF(100f, 110f, 200f, 210f), null);
        canvas.drawBitmap(mwButtonUp, null, new RectF(300f, 1600f, 440f, 1740f), null);
        canvas.drawBitmap(mwButtonDown, null, new RectF(300f, 2000f, 440f, 2140f), null);
        canvas.drawBitmap(mwButtonLeft, null, new RectF(100f, 1800f, 240f, 1940f), null);
        canvas.drawBitmap(mwButtonRight, null, new RectF(500f, 1800f, 640f, 1940f), null);
        canvas.drawBitmap(mwHeroHp, null, new RectF(500f, 1600f, 640f, 1740f), null);
        canvas.drawBitmap(mwHeroHp, null, new RectF(550f, 1600f, 690f, 1740f), null);
        canvas.drawBitmap(mwHeroHp, null, new RectF(600f, 1600f, 740f, 1740f), null);
        canvas.drawBitmap(mwHeroHp, null, new RectF(650f, 1600f, 790f, 1740f), null);
        canvas.drawBitmap(mwHeroHp, null, new RectF(700f, 1600f, 840f, 1740f), null);
        canvas.drawBitmap(mwHeroHp, null, new RectF(750f, 1600f, 890f, 1740f), null);
        canvas.drawBitmap(mwHeroItem, null, new RectF(500f, 2000f, 640f, 2140f), null);
        canvas.drawBitmap(mwButtonAttack, null, new RectF(750f, 1800f, 890f, 1940f), null);
        invalidate();
        }
}
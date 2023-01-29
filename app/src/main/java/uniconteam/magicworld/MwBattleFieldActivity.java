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
	
	private String mwEG = "v0.1a";
    private Bitmap mwJohnBitmap;
    private Bitmap mwSlimeBitmap;
    private Bitmap mwButtonUp;
    private Bitmap mwButtonDown;
    private Bitmap mwButtonLeft;
    private Bitmap mwButtonRight;
    private Timer mwTimer = new Timer();
    private TimerTask mwTimerTask;
    int currentFrame = 0;
    int fps = 9;
    int x = 0;
    int y = 0;
    
    Bitmap[] mwJohnBitmaps = new Bitmap[]{ BitmapFactory.decodeResource(getResources(), R.drawable.magicworld_hero_john_animation_1), BitmapFactory.decodeResource(getResources(), R.drawable.magicworld_hero_john_animation_2), BitmapFactory.decodeResource(getResources(), R.drawable.magicworld_hero_john_animation_3),};
    Bitmap[] mwSlimeBitmaps = new Bitmap[]{ BitmapFactory.decodeResource(getResources(), R.drawable.magicworld_mob_slime_animation_walk_3), BitmapFactory.decodeResource(getResources(), R.drawable.magicworld_mob_slime_animation_walk_4), BitmapFactory.decodeResource(getResources(), R.drawable.magicworld_mob_slime_animation_walk_5),};
    
	public MwBattleFieldMap (Context context){
		super(context);
        mwButtonUp = BitmapFactory.decodeResource(context.getResources(), R.drawable.magicworld_button_up);
        mwButtonDown = BitmapFactory.decodeResource(context.getResources(), R.drawable.magicworld_button_down);
        mwButtonRight = BitmapFactory.decodeResource(context.getResources(), R.drawable.magicworld_button_right);
        mwButtonLeft = BitmapFactory.decodeResource(context.getResources(), R.drawable.magicworld_button_left);
        
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
    float xControll = event.getX();
    float yControll = event.getY();
    switch(event.getAction())
    {
        case MotionEvent.ACTION_DOWN:
        if(xControll > 300f && xControll < 440f && yControll > 1200f && yControll < 1340f)
        {
                x -= 40;
        }
        if(xControll > 300f && xControll < 440f && yControll > 1600f && yControll < 1740f)
        {
                x += 40;
        }
        if(xControll > 100f && xControll < 240f && yControll > 1400f && yControll < 1540f)
        {
                y -= 40;
        }
        if(xControll > 500f && xControll < 640f && yControll > 1400f && yControll < 1540f)
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
            x = x;
            y = y;
        canvas.drawBitmap(mwJohnBitmap, null, new RectF(100f+y, 1100+x, 200f+y, (1200+x)), null);
        canvas.drawBitmap(mwSlimeBitmap, null, new RectF(100f, 110f, 200f, 210f), null);
        canvas.drawBitmap(mwButtonUp, null, new RectF(300f, 1200f, 440f, 1340f), null);
        canvas.drawBitmap(mwButtonDown, null, new RectF(300f, 1600f, 440f, 1740f), null);
        canvas.drawBitmap(mwButtonLeft, null, new RectF(100f, 1400f, 240f, 1540f), null);
        canvas.drawBitmap(mwButtonRight, null, new RectF(500f, 1400f, 640f, 1540f), null);
      invalidate();
        }
}
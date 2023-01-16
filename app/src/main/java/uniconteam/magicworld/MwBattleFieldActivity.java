package uniconteam.magicworld;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;
import android.graphics.Rect;
import android.graphics.RectF;
import android.widget.Button;
import java.util.Timer;
import java.util.TimerTask;
import uniconteam.magicworld.MwBattleFieldActivity;

public class MwBattleFieldActivity extends View{
	
	private String mwEG = "v0.1a";
    private Bitmap mwBitmap;
    private Timer mwTimer = new Timer();
    private TimerTask mwTimerTask;
    int currentFrame = 0;
    int fps = 9;
    int x = 0;
    int y = 0;
    int z = 0;
    int w = 0;
    int vx = 1;
    int widthRect = 300;
    
        
    Bitmap[] bitmaps = new Bitmap[]{ BitmapFactory.decodeResource(getResources(), R.drawable.magicworld_hero_john_animation_1), BitmapFactory.decodeResource(getResources(), R.drawable.magicworld_hero_john_animation_2), BitmapFactory.decodeResource(getResources(), R.drawable.magicworld_hero_john_animation_3),};
	public MwBattleFieldActivity (Context context){
		super(context);
        
        new Thread( new Runnable() { 
        @Override public void run() {
            while(true) {
                for(int i = 0; i < bitmaps.length; i++) {
                    currentFrame = i;
                           mwBitmap = bitmaps[i];
                    try {
                        Thread.sleep(1000L / fps);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        } } ).start();
	}
	@Override
	protected void onDraw(Canvas canvas) {
		super.onDraw(canvas);
            x = x + vx;
        
        if (x > canvas.getWidth() - widthRect){
            vx = vx * -1;
           }
        if (x < 0){
            vx = vx * -1;
           }
        canvas.drawBitmap(mwBitmap, null, new RectF(100f, 100+x, 200f, (100+x)+100f), null);
        
      invalidate();
        }
}
package uniconteam.magicworld.attack;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import uniconteam.magicworld.MagicAttackMap;

public class BackElement {
    private final Context context;
    
    public static float biomeSizeX = 1200;
    public static float biomeSizeY = 500;
    
    public static Paint paint = new Paint();
    
    public BackElement(Context context) {
        this.context = context;
    }

    public static void drawBack(Canvas canvas) {
        // Background
        
        // greenfield
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(Color.parseColor("#2C6E3C"));
        paint.setAlpha(0x100); 
        canvas.drawRect(0, 0, biomeSizeX, biomeSizeY, paint);
        
        /*
        // desert
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(Color.parseColor("#f2ae24"));
        paint.setAlpha(0x100);
        canvas.drawRect(0f, 1000f, 2200f, 2500f, paint);
        */
    }
}
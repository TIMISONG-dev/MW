package uniconteam.magicworld.attack;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;

public class GameElements {
    private final Context context;
    private final Paint paint;
    public static Bitmap buttonUp; // Buttons 1-4 \/
    public static Bitmap buttonDown;
    public static Bitmap buttonLeft;
    public static Bitmap buttonRight;
    public static Bitmap buttonAttack; // Hero attack button
    public static Bitmap johnCard;
    
    public GameElements(Context context) {
        this.context = context;
        paint = new Paint();
    }

    public static void drawBackground(Canvas canvas) {
        canvas.drawBitmap(buttonUp, null, new RectF(300f, 1600f, 440f, 1740f), null);
        canvas.drawBitmap(buttonDown, null, new RectF(300f, 2000f, 440f, 2140f), null);
        canvas.drawBitmap(buttonLeft, null, new RectF(100f, 1800f, 240f, 1940f), null);
        canvas.drawBitmap(buttonRight, null, new RectF(500f, 1800f, 640f, 1940f), null);
        canvas.drawBitmap(buttonAttack, null, new RectF(750f, 1800f, 890f, 1940f), null);
        canvas.drawBitmap(johnCard, null, new RectF(650f, 1900f, 1150f, 2400f), null);
    }
}
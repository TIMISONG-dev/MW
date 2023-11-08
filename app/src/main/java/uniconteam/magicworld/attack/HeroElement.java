package uniconteam.magicworld.attack;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

public class HeroElement extends AppCompatActivity{
    private final Context context;
    public static Bitmap john; // John hero image
    
    public HeroElement(Context context) {
        this.context = context;
    }

    public static void drawHero(Canvas canvas) {
        canvas.drawBitmap(john, null, new RectF(MagicHero.heroX, MagicHero.heroY, MagicHero.heroX + 100, MagicHero.heroY + 100), null);
    }
}
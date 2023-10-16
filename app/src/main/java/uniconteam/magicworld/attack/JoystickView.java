package uniconteam.magicworld;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

public class JoystickView extends View {
    private float centerX = 300;
    private float centerY = 1600;
    private float joystickRadius = 100;
    private float touchX = 0;
    private float touchY = 0;

    public JoystickView(Context context) {
        super(context);
    }

    public JoystickView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        centerX = w / 2f;
        centerY = h / 2f;
        joystickRadius = Math.min(w, h) / 3f;
    }

    public void drawJoy(Canvas canvas) {
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(5);

        // Рисуем джойстик
        canvas.drawCircle(centerX, centerY, joystickRadius, paint);

        // Рисуем точку, представляющую положение джойстика
        canvas.drawCircle(touchX, touchY, joystickRadius / 3, paint);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
            case MotionEvent.ACTION_MOVE:
                float dx = event.getX() - centerX;
                float dy = event.getY() - centerY;
                float distance = (float) Math.sqrt(dx * dx + dy * dy);

                // Если касание находится в пределах радиуса джойстика
                if (distance <= joystickRadius) {
                    touchX = event.getX();
                    touchY = event.getY();
                   
                } else {
                    // Если касание находится за пределами радиуса джойстика, пересчитываем положение
                    float angle = (float) Math.atan2(dy, dx);
                    touchX = centerX + joystickRadius * (float) Math.cos(angle);
                    touchY = centerY + joystickRadius * (float) Math.sin(angle);
                }

                // Обновляем канвас
                invalidate();
                break;
            case MotionEvent.ACTION_UP:
                // Сбрасываем положение джойстика при отпускании
                touchX = centerX;
                touchY = centerY;
                invalidate();
                break;
        }
        return true;
    }
}
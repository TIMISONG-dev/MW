package uniconteam.magicworld.engine;

import android.animation.ObjectAnimator;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import java.util.Timer;
import java.util.TimerTask;

public class MwConsortium2 extends AppCompatActivity {
    public void mwClick(Object object, ObjectAnimator objX, ObjectAnimator objY, float f1, float f2, float f3, Timer _timerTask, TimerTask timerTask){
        // Animates scaleX
        objX.setTarget(object);
        objX.setPropertyName("scaleX");
        objX.setFloatValues(f1);
        objX.setDuration(100);
        objX.start();
        // Animates scaleY
        objY.setTarget(object);
        objY.setPropertyName("scaleY");
        objY.setFloatValues(f1);
        objY.setDuration(100);
        objY.start();

        timerTask =
                new TimerTask() {
                    @Override
                    public void run() {
                        runOnUiThread(
                                () -> {
                                    objX.setTarget(object);
                                    objX.setPropertyName("scaleX");
                                    objX.setFloatValues(f2);
                                    objX.setDuration(200);
                                    objX.start();

                                    objY.setTarget(object);
                                    objY.setPropertyName("scaleY");
                                    objY.setFloatValues(f2);
                                    objY.setDuration(200);
                                    objY.start();
                                });
                    }
                };
        _timerTask.schedule(timerTask, 100);
        
        timerTask =
                new TimerTask() {
                    @Override
                    public void run() {
                        runOnUiThread(
                                () -> {
                                    objX.setTarget(object);
                                    objX.setPropertyName("scaleX");
                                    objX.setFloatValues(f3);
                                    objX.setDuration(250);
                                    objX.start();

                                    objY.setTarget(object);
                                    objY.setPropertyName("scaleY");
                                    objY.setFloatValues(f3);
                                    objY.setDuration(250);
                                    objY.start();
                                });
                    }
                };
        _timerTask.schedule(timerTask, 300);
    }
}
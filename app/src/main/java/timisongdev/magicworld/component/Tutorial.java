package timisongdev.magicworld.component;

import android.animation.ObjectAnimator;
import androidx.appcompat.app.AppCompatActivity;
import java.util.Timer;
import java.util.TimerTask;
import timisongdev.magicworld.activity.HomeActivity;
import timisongdev.magicworld.engine.MwConsortium;

public class Tutorial extends AppCompatActivity{
    
    ObjectAnimator[] objX = new ObjectAnimator[3];
    ObjectAnimator[] objY = new ObjectAnimator[3];
    ObjectAnimator alpha = new ObjectAnimator();
    
    TimerTask timerTask;
    Timer _timerTask = new Timer();
    
    MwConsortium mwc = new MwConsortium();
    
    // Block of tutorial
    public void tutorialData(){
        
        for(int i = 0; i < 3; i++){
            objX[i] = new ObjectAnimator();
            objY[i] = new ObjectAnimator();
        }
        
        if(HomeActivity.tutorialLevel == 1){
           HomeActivity.binding.mwTutorialBoxText.setText("For start tutorial or next step click on this box");
            mwc.mwClick(HomeActivity.binding.mwTutorialBoxLinear, objX[1], objY[1], 1.1f, 0.9f, 1.0f, _timerTask, timerTask);
            timerTask = new TimerTask() {
                    @Override
                    public void run() {
                        runOnUiThread(
                                () -> {
                                    alpha.setTarget(HomeActivity.binding.mwTutorialBoxLinear);
                                    alpha.setPropertyName("alpha");
                                    alpha.setFloatValues(0.5f);
                                    alpha.setDuration(500);
                                });
                    }
                };
        _timerTask.scheduleAtFixedRate(timerTask, 250, 250);
        }
        if(HomeActivity.tutorialLevel == 2){
            HomeActivity.binding.mwTutorialBoxText.setText("In your item you have coinhouse — put house on block");
        }
    }
}
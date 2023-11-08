package uniconteam.magicworld;

import androidx.appcompat.app.AppCompatActivity;
import java.util.Timer;
import java.util.TimerTask;
import uniconteam.magicworld.HomeActivity;

public class Tutorial extends AppCompatActivity{
    
    TimerTask timerTask;
    Timer _timerTask = new Timer();
    
    // Block of tutorial
    public void tutorialData(){
        if(HomeActivity.tutorialLevel == 1){
           /* HomeActivity.tutorialBoxText.setText("For start tutorial or next step click on this box");
            mwConsortium.mwClick();
            mwConsortium.mwThreads(HomeActivity.tutorialBoxLinear, HomeActivity.tutorialBoxObjX, HomeActivity.tutorialBoxObjY, 1.1f, 0.9f, 1.0f);
            timerTask = new TimerTask() {
                    @Override
                    public void run() {
                        runOnUiThread(
                                () -> {
                                    HomeActivity.tutorialBoxAlpha.setTarget(HomeActivity.tutorialBoxLinear);
                                    HomeActivity.tutorialBoxAlpha.setPropertyName("alpha");
                                    HomeActivity.tutorialBoxAlpha.setFloatValues(0.5f);
                                    HomeActivity.tutorialBoxAlpha.setDuration(500);
                                });
                    }
                };
        _timerTask.scheduleAtFixedRate(timerTask, 250, 250); */
        }
        if(HomeActivity.tutorialLevel == 2){
            HomeActivity.binding.mwTutorialBoxText.setText("In your item you have coinhouse — put house on block");
        }
    }
}
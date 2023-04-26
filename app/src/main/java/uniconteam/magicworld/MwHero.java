package uniconteam.magicworld;

import android.animation.ObjectAnimator;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import java.util.Timer;
import java.util.TimerTask;

public class MwHero extends AppCompatActivity {
    
    MwCollisionRect rect;
    
    public int mwHeroHp = 6;
    public float mwHeroX = 100;
    public float mwHeroY = 1100;
    public float mwHeroZ = 200;
    public float mwHeroW = 1200;
    public boolean mwHeroAttackRule = false;

    public TimerTask mwTimerTask;
    public Timer _mwTimerTask = new Timer();
    
    
   public void MwHeroSpw(){
   this.rect = new MwCollisionRect(mwHeroX, mwHeroY, 100f, 100f);
   }
    
   public MwCollisionRect getCollisionRect(){
        return rect;
   }
    public void MwHeroAttack() {
            if (mwHeroAttackRule == false) {

                mwHeroAttackRule = true;

                mwTimerTask =
                        new TimerTask() {
                            @Override
                            public void run() {
                                runOnUiThread(
                                        new Runnable() {
                                            @Override
                                            public void run() {
                                                mwHeroAttackRule = false;
                                            }
                                        });
                            }
                        };
                _mwTimerTask.scheduleAtFixedRate(mwTimerTask, 1000, 1000);
            }
    }
}
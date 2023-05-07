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

    public TimerTask mwTimerTask;
    public Timer _mwTimerTask = new Timer();
    
    
   public void MwHeroSpw(){
   this.rect = new MwCollisionRect(mwHeroX, mwHeroY, 100f, 100f);
   }
    
   public MwCollisionRect getCollisionRect(){
        return rect;
   }
}
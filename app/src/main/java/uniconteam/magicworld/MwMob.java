package uniconteam.magicworld;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ThreadLocalRandom;

public class MwMob extends AppCompatActivity{

    public static TimerTask mwTimerTask;
	public static Timer _mwTimerTask  = new Timer();
    public static Boolean mwMobXUpAcept = true;
    public static Boolean mwMobYUpAcept = true;
    public static Boolean mwMobXDownAcept = true;
    public static Boolean mwMobYDownAcept = true;
    
    // Random for IA slime (where will the mob go)
    
    // 1 - Up, 2 - Down, 3 - Right, 4 - Left
    public int mwSlimeWay = ThreadLocalRandom.current().nextInt(1, 5 + 1);
    
    // Duration of way
    public int mwSlimeDur = ThreadLocalRandom.current().nextInt(1, 6 + 1);
    
    public int mwSlimeX = 100;
    public int mwSlimeY = 110;
    public int mwSlimeZ = 200;
    public int mwSlimeW = 210;
    public int mwMobHp = 6;
    
    public void mwSlimeRand(){
        mwTimerTask = new TimerTask(){
                        @Override
            public void run(){
                            runOnUiThread(new Runnable(){
                                @Override
                                public void run(){
                            mwSlimeWay = ThreadLocalRandom.current().nextInt(1, 5 + 1);
                            mwSlimeDur = ThreadLocalRandom.current().nextInt(1, 6 + 1);
                            mwSlimeRoad();
                  }
              });
            }
       };
        _mwTimerTask.scheduleAtFixedRate(mwTimerTask, 500, 500);
    }
    
    public void mwSlimeRoad(){
    if (mwMobYUpAcept){
      if (mwSlimeWay == 1 || mwSlimeWay == 4){
        for (int i = 0; i < mwSlimeDur; i++){
            mwSlimeY += 10;
            mwSlimeW += 10;
        }
      }
    }
    if (mwMobYDownAcept) {   
      if (mwSlimeWay == 2){
        for (int i = 0; i < mwSlimeDur; i++){
            mwSlimeY -= 10;
            mwSlimeW -= 10;
        }
      }
    }        
    if (mwMobXUpAcept){ 
      if (mwSlimeWay == 3){
        for (int i = 0; i < mwSlimeDur; i++){
            mwSlimeX += 10;
            mwSlimeZ += 10;
        }
      }  
    }
    if (mwMobXDownAcept){           
      if (mwSlimeWay == 5){
        for (int i = 0; i < mwSlimeDur; i++){
            mwSlimeX -= 10;
            mwSlimeZ -= 10;
        }
      } 
    }         
   }
}
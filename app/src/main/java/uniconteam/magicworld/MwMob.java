package uniconteam.magicworld;

import androidx.appcompat.app.AppCompatActivity;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.IntStream;

public class MwMob extends AppCompatActivity{
    
    MwCollisionRect rect;

    public TimerTask mwTimerTask;
	public Timer _mwTimerTask  = new Timer();
    
    public boolean mwSlimeXUpAcept = true;
    public boolean mwSlimeYUpAcept = true;
    public boolean mwSlimeXDownAcept = true;
    public boolean mwSlimeYDownAcept = true;
    
    public boolean mwSlimeCooldown = false;
    
    // Random for IA slime (where will the mob go)
    
    // 1 - Up, 2 - Down, 3 - Right, 4 - Left
    public int mwSlimeWay;
    
    // Duration of way
    public int mwSlimeDur;
    
    // Random number for spawn mob 1 - slime, 2 - tikvach
    public int mwSpawnRand = ThreadLocalRandom.current().nextInt(1, 2 + 1);
    
    MwHero mwHero = new MwHero();
    
    public static float mwSlimeX = 0;
    public static float mwSlimeY = 0;
    public static float mwSlimeZ = 0;
    public static float mwSlimeW = 0;
    public static int mwSlimeHp = 6;
    
    public void mwSlimeHpCheck(){
        if(mwSlimeHp == 0 || mwSlimeHp < 0){
            mwSlimeX = 24000;
            mwSlimeY = 24000;
            mwSlimeZ = 24000;
            mwSlimeW = 24000;
        }
    }
    
    public void mwSlimeRand(){
        mwTimerTask =
                new TimerTask() {
                    @Override
                    public void run() {
                        runOnUiThread(
                                new Runnable() {
                                    @Override
                                    public void run() {
                                        if (Math.abs(mwSlimeX - MwHero.mwHeroX) <= 300 || Math.abs(mwSlimeY - MwHero.mwHeroY) <= 300) {
                                           if (mwSlimeX < MwHero.mwHeroX) {
                                               mwSlimeWay = 3;
                                               mwSlimeDur = ThreadLocalRandom.current().nextInt(1, 6 + 1);
                                               mwSlimeRoad();
                                           } else 
                                               if (mwSlimeX > MwHero.mwHeroX) {
                                                  mwSlimeWay = 4;
                                                  mwSlimeDur = ThreadLocalRandom.current().nextInt(1, 6 + 1);
                                                  mwSlimeRoad();
                                               }
                                                  if (mwSlimeY < MwHero.mwHeroY) {
                                                   mwSlimeWay = 1;
                                                   mwSlimeDur = ThreadLocalRandom.current().nextInt(1, 6 + 1);
                                                   mwSlimeRoad();
                                                  } else 
                                                      if (mwSlimeY > MwHero.mwHeroY) {
                                                          mwSlimeWay = 2;
                                                          mwSlimeDur = ThreadLocalRandom.current().nextInt(1, 6 + 1);
                                                          mwSlimeRoad();
                                                    }
                                        } else {
                                            mwSlimeWay = ThreadLocalRandom.current().nextInt(1, 4 + 1);
                                            mwSlimeDur = ThreadLocalRandom.current().nextInt(1, 6 + 1);
                                            mwSlimeRoad();
                                        }
                                   }
                                });
                    }
                };
        _mwTimerTask.scheduleAtFixedRate(mwTimerTask, 500, 500);
    }
    
    public void MwSlimeSpw(){
        this.rect = new MwCollisionRect(mwSlimeX, mwSlimeY, 100f, 100f);
    }
    
    public void mwSlimeRoad(){
          
    if (mwSlimeYUpAcept){
      if (mwSlimeWay == 1){
        for (int yu = 0; yu < mwSlimeDur; yu++){
            mwSlimeY += 5;
            mwSlimeW += 5;
        }
      }
    }
    if (mwSlimeYDownAcept) {   
      if (mwSlimeWay == 2){
        for (int dy = 0; dy < mwSlimeDur; dy++){
            mwSlimeY -= 5;
            mwSlimeW -= 5;
        }
      }
    }        
    if (mwSlimeXUpAcept){ 
      if (mwSlimeWay == 3){
        for (int ux = 0; ux < mwSlimeDur; ux++){
            mwSlimeX += 5;
            mwSlimeZ += 5;
        }
      }  
    }
    if (mwSlimeXDownAcept){           
      if (mwSlimeWay == 4){
        for (int dx = 0; dx < mwSlimeDur; dx++){
            mwSlimeX -= 5;
            mwSlimeZ -= 5;
        }
      } 
    }         
   }
   public MwCollisionRect getCollisionRect(){
        return rect;
   }
   public void MwMobCooldown(){
       if(mwSlimeCooldown == false){
            
            mwSlimeCooldown = true;
            
           mwTimerTask = new TimerTask(){
                        @Override
            public void run(){
                            runOnUiThread(new Runnable(){
                                @Override
                                public void run(){
                            mwSlimeCooldown = false;
                  }
              });
            }
       };
        _mwTimerTask.scheduleAtFixedRate(mwTimerTask, 2000, 2000);
       }
   }
}
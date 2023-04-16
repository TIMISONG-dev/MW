package uniconteam.magicworld;

import androidx.appcompat.app.AppCompatActivity;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ThreadLocalRandom;

public class MwMob extends AppCompatActivity{
    
    MwCollisionRect rect;

    public TimerTask mwTimerTask;
	public Timer _mwTimerTask  = new Timer();
    public Boolean mwMobXUpAcept = true;
    public Boolean mwMobYUpAcept = true;
    public Boolean mwMobXDownAcept = true;
    public Boolean mwMobYDownAcept = true;
    
    MwHero mwHero = new MwHero();
    
    // Random for IA slime (where will the mob go)
    
    // 1 - Up, 2 - Down, 3 - Right, 4 - Left
    public int mwSlimeWay = ThreadLocalRandom.current().nextInt(1, 5 + 1);
    
    // Duration of way
    public int mwSlimeDur = ThreadLocalRandom.current().nextInt(1, 6 + 1);
    
    // Random number for spawn mob 1 - slime, 2 - tikvach
    public int mwSpawnRand = ThreadLocalRandom.current().nextInt(1, 2 + 1);
    
    public float mwSlimeX = 0;
    public float mwSlimeY = 0;
    public float mwSlimeZ = 0;
    public float mwSlimeW = 0;
    public int mwMobHp = 6;
    
    public void mwSlimeRand(){
        
        mwTimerTask = new TimerTask(){
                        @Override
            public void run(){
                            runOnUiThread(new Runnable(){
                                @Override
                                public void run(){
                            if ((mwHero.mwHeroY == mwSlimeY + 20 || mwHero.mwHeroY == mwSlimeY + 21 || mwHero.mwHeroY == mwSlimeY + 22 || mwHero.mwHeroY == mwSlimeY + 23 || mwHero.mwHeroY == mwSlimeY + 24 || mwHero.mwHeroY == mwSlimeY + 25 || mwHero.mwHeroY == mwSlimeY + 26 || mwHero.mwHeroY == mwSlimeY + 27 || mwHero.mwHeroY == mwSlimeY + 28 || mwHero.mwHeroY == mwSlimeY + 29 || mwHero.mwHeroY == mwSlimeY + 30 || mwHero.mwHeroY == mwSlimeY + 31 || mwHero.mwHeroY == mwSlimeY + 32 || mwHero.mwHeroY == mwSlimeY + 33 || mwHero.mwHeroY == mwSlimeY + 34 || mwHero.mwHeroY == mwSlimeY + 35 || mwHero.mwHeroY == mwSlimeY + 36 || mwHero.mwHeroY == mwSlimeY + 37 || mwHero.mwHeroY == mwSlimeY + 38 || mwHero.mwHeroY == mwSlimeY + 39 || mwHero.mwHeroY == mwSlimeY + 40 || mwHero.mwHeroY == mwSlimeY + 41 || mwHero.mwHeroY == mwSlimeY + 42 || mwHero.mwHeroY == mwSlimeY + 43 || mwHero.mwHeroY == mwSlimeY + 44 || mwHero.mwHeroY == mwSlimeY + 45 || mwHero.mwHeroY == mwSlimeY + 46 || mwHero.mwHeroY == mwSlimeY + 47 || mwHero.mwHeroY == mwSlimeY + 48 || mwHero.mwHeroY == mwSlimeY + 49 || mwHero.mwHeroY == mwSlimeY + 50 || mwHero.mwHeroY == mwSlimeY + 51 || mwHero.mwHeroY == mwSlimeY + 52 || mwHero.mwHeroY == mwSlimeY + 53 || mwHero.mwHeroY == mwSlimeY + 54 || mwHero.mwHeroY == mwSlimeY + 55 || mwHero.mwHeroY == mwSlimeY + 56 || mwHero.mwHeroY == mwSlimeY + 57 || mwHero.mwHeroY == mwSlimeY + 58 || mwHero.mwHeroY == mwSlimeY + 59 || mwHero.mwHeroY == mwSlimeY + 60 || mwHero.mwHeroY == mwSlimeY + 61 || mwHero.mwHeroY == mwSlimeY + 62 || mwHero.mwHeroY == mwSlimeY + 63 || mwHero.mwHeroY == mwSlimeY + 64 || mwHero.mwHeroY == mwSlimeY + 65 || mwHero.mwHeroY == mwSlimeY + 66 || mwHero.mwHeroY == mwSlimeY + 67 || mwHero.mwHeroY == mwSlimeY + 68 || mwHero.mwHeroY == mwSlimeY + 69 || mwHero.mwHeroY == mwSlimeY + 70 || mwHero.mwHeroY == mwSlimeY + 71 ||mwHero.mwHeroY == mwSlimeY + 72 ||mwHero.mwHeroY == mwSlimeY + 73 || mwHero.mwHeroY == mwSlimeY + 74 || mwHero.mwHeroY == mwSlimeY + 75 || mwHero.mwHeroY == mwSlimeY + 76 || mwHero.mwHeroY == mwSlimeY + 77 || mwHero.mwHeroY == mwSlimeY + 78 || mwHero.mwHeroY == mwSlimeY + 79 || mwHero.mwHeroY == mwSlimeY + 80 || mwHero.mwHeroY == mwSlimeY + 81 || mwHero.mwHeroY == mwSlimeY + 82 || mwHero.mwHeroY == mwSlimeY + 83 || mwHero.mwHeroY == mwSlimeY + 84 || mwHero.mwHeroY == mwSlimeY + 85 || mwHero.mwHeroY == mwSlimeY + 86 || mwHero.mwHeroY == mwSlimeY + 87 || mwHero.mwHeroY == mwSlimeY + 88 || mwHero.mwHeroY == mwSlimeY + 89 || mwHero.mwHeroY == mwSlimeY + 90 || mwHero.mwHeroY == mwSlimeY + 91 || mwHero.mwHeroY == mwSlimeY + 92 || mwHero.mwHeroY == mwSlimeY + 93 || mwHero.mwHeroY == mwSlimeY + 94 || mwHero.mwHeroY == mwSlimeY + 95 || mwHero.mwHeroY == mwSlimeY + 96 || mwHero.mwHeroY == mwSlimeY + 97)){
                            mwSlimeWay = 1;
                            mwSlimeDur = ThreadLocalRandom.current().nextInt(1, 6 + 1);
                            mwSlimeRoad();
                            } else {
                                if (mwHero.mwHeroX == mwSlimeX + 100){
                                mwSlimeWay = 3;
                                mwSlimeDur = ThreadLocalRandom.current().nextInt(1, 6 + 1);
                                mwSlimeRoad();
                                } else {
                                    if (mwHero.mwHeroX == mwSlimeX - 100){
                                    mwSlimeWay = 4;
                                    mwSlimeDur = ThreadLocalRandom.current().nextInt(1, 6 + 1);
                                    mwSlimeRoad();
                                    } else {
                                        mwSlimeWay = ThreadLocalRandom.current().nextInt(1, 5 + 1);
                                        mwSlimeDur = ThreadLocalRandom.current().nextInt(1, 6 + 1);
                                        mwSlimeRoad();
                                    }
                                }
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
   public MwCollisionRect getCollisionRect(){
        return rect;
   }
}
package uniconteam.magicworld;
import java.util.concurrent.ThreadLocalRandom;

public class MwMob {
    
    // Random for IA slime (where will the mob go)
    
    // 1 - Up, 2 - Down, 3 - Right, 4 - Left
    public int mwSlimeWay = ThreadLocalRandom.current().nextInt(1, 4 + 1);
    
    // Duration of way
    public int mwSlimeDur = ThreadLocalRandom.current().nextInt(1, 6 + 1);
    
    public int mwSlimeX = 100;
    public int mwSlimeY = 110;
    public int mwSlimeZ = 200;
    public int mwSlimeW = 210;
    public int mwMobHp = 6;
    
    public void mwSlimeRand(){
        mwSlimeWay = ThreadLocalRandom.current().nextInt(1, 5 + 1);
        mwSlimeDur = ThreadLocalRandom.current().nextInt(1, 6 + 1);
    }
    public void mwSlimeRoad(){
      if (mwSlimeWay == 1 || mwSlimeWay == 4){
        for (int i = 0; i < mwSlimeDur; i++){
            mwSlimeY += 10;
            mwSlimeW += 10;
        }
        mwSlimeRand();
      }
      if (mwSlimeWay == 2){
        for (int i = 0; i < mwSlimeDur; i++){
            mwSlimeY -= 10;
            mwSlimeW -= 10;
        }
        mwSlimeRand();
      }
      if (mwSlimeWay == 3){
        for (int i = 0; i < mwSlimeDur; i++){
            mwSlimeX += 10;
            mwSlimeZ += 10;
        }
        mwSlimeRand();
      }  
      if (mwSlimeWay == 5){
        for (int i = 0; i < mwSlimeDur; i++){
            mwSlimeX -= 10;
            mwSlimeZ -= 10;
        }
        mwSlimeRand();
      }  
   }
}
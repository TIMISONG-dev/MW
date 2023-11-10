package uniconteam.magicworld.attack;

import androidx.appcompat.app.AppCompatActivity;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.IntStream;

public class MagicMob extends AppCompatActivity{
    
    @Override
    protected void onPause(){
        super.onPause();
        timer.purge();
        timer.cancel();
        timerTask.cancel();
    }
    
    CollisionRect rect;

    public TimerTask timerTask;
	public Timer timer = new Timer();
    
    public boolean slimeXUpAcept = true;
    public boolean slimeYUpAcept = true;
    public boolean slimeXDownAcept = true;
    public boolean slimeYDownAcept = true;
    
    public boolean slimeCooldown = false;
    public static boolean slimeDead = false;
    
    // Random for IA slime (where will the mob go)
    
    // 1 - Up, 2 - Down, 3 - Right, 4 - Left
    public int slimeWay;
    
    // Duration of way
    public int slimeDur;
    
    // Random number for spawn mob 1 - slime, 2 - tikvach
    public int spawnRand = ThreadLocalRandom.current().nextInt(1, 2 + 1);
    
    public static float slimeX = 0;
    public static float slimeY = 0;
    public static int slimeHp = 6;
    
    
    public void slimeRand() {
      timerTask = new TimerTask() {
        @Override
        public void run() {
            runOnUiThread(() -> {
              if(!slimeDead){          
                if (Math.abs(slimeX - MagicHero.heroX) <= 300 || Math.abs(slimeY - MagicHero.heroY) <= 300) {
                    if (slimeX < MagicHero.heroX) {
                        slimeWay = 3;
                        slimeRoad();
                    } else 
                    if (slimeX > MagicHero.heroX) {
                        slimeWay = 4;
                        slimeRoad();
                    }
                    if (slimeY < MagicHero.heroY) {
                        slimeWay = 1;
                        slimeRoad();
                    } else 
                    if (slimeY > MagicHero.heroY) {
                        slimeWay = 2;
                        slimeRoad();
                    }
                    slimeDur = ThreadLocalRandom.current().nextInt(1, 6 + 1);
                } else {
                    slimeWay = ThreadLocalRandom.current().nextInt(1, 4 + 1);
                    slimeDur = ThreadLocalRandom.current().nextInt(1, 6 + 1);
                }
                slimeRoad();
              }
            });
        }
     };
     timer.scheduleAtFixedRate(timerTask, 500, 500);
    }

    
    public void slimeSpw(){
        this.rect = new CollisionRect(slimeX, slimeY, 100f, 100f);
    }
    
    public void slimeRoad(){
          
    if (slimeYUpAcept){
      if (slimeWay == 1){
        for (int yu = 0; yu < slimeDur; yu++){
            slimeY += 5;
        }
      }
    }
    if (slimeYDownAcept) {   
      if (slimeWay == 2){
        for (int dy = 0; dy < slimeDur; dy++){
            slimeY -= 5;
        }
      }
    }        
    if (slimeXUpAcept){ 
      if (slimeWay == 3){
        for (int ux = 0; ux < slimeDur; ux++){
            slimeX += 5;
        }
      }  
    }
    if (slimeXDownAcept){           
      if (slimeWay == 4){
        for (int dx = 0; dx < slimeDur; dx++){
            slimeX -= 5;
        }
      } 
    }         
   }
   public CollisionRect getCollisionRect(){
        return rect;
   }
   public void mobCooldown(){
       if(!slimeCooldown){
            slimeCooldown = true;
            
           timerTask = new TimerTask(){
                        @Override
            public void run(){
                            runOnUiThread(() -> slimeCooldown = false);
            }
       };
        timer.scheduleAtFixedRate(timerTask, 2000, 2000);
       }
   }
}
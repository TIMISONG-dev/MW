package uniconteam.magicworld;

import androidx.appcompat.app.AppCompatActivity;

public class MwHero extends AppCompatActivity{
    
    MwCollisionRect rect;
    
    public int mwHeroHp = 6;
    public float mwHeroX = 100;
    public float mwHeroY = 1100;
    public float mwHeroZ = 200;
    public float mwHeroW = 1200;
    
   public void MwHeroSpw(){
   this.rect = new MwCollisionRect(mwHeroX, mwHeroY, 100f, 100f);
   }
    
   public MwCollisionRect getCollisionRect(){
        return rect;
   }
}
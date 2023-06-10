package uniconteam.magicworld;

public class MwHero {

    MwCollisionRect rect;

    public static int mwHeroHp = 6;
    public static float mwHeroX = 200;
    public static float mwHeroY = 1100;
    
    public void mwHeroHpCheck(){
        if(mwHeroHp == 0 || mwHeroHp < 0){
            mwHeroX = 24000;
            mwHeroY = 24000;
        }
    }

    public void MwHeroSpw() {
        this.rect = new MwCollisionRect(mwHeroX, mwHeroY, 100f, 100f);
    }

    public MwCollisionRect getCollisionRect() {
        return rect;
    }

    public void mwHeroUp() {
        mwHeroY -= 30;
    }

    public void mwHeroDown() {
        mwHeroY += 30;
    }

    public void mwHeroLeft() {
        mwHeroX -= 30;
    }

    public void mwHeroRight() {
        mwHeroX += 30;
    }
}

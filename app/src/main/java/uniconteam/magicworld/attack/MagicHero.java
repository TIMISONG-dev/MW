package uniconteam.magicworld;

public class MagicHero {

    CollisionRect rect;

    public static int heroHp = 6;
    public static float heroX = 200;
    public static float heroY = 1100;
    
    public void heroHpCheck(){
        if(heroHp == 0 || heroHp < 0){
            heroX = 24000;
            heroY = 24000;
        }
    }

    public void heroSpw() {
        this.rect = new CollisionRect(heroX, heroY, 100f, 100f);
    }

    public CollisionRect getCollisionRect() {
        return rect;
    }

    public void heroUp() {
        heroY -= 30;
    }

    public void heroDown() {
        heroY += 30;
    }

    public void heroLeft() {
        heroX -= 30;
    }

    public void heroRight() {
        heroX += 30;
    }
}

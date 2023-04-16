package uniconteam.magicworld;

public class MwCollisionRect {
    
    float x, y, width, height;

    public MwCollisionRect(float x, float y, float width, float height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public void Move (float x, float y) {
        this.x = x;
        this.y = y;
    }

    public boolean CollidesWith (MwCollisionRect rect) {
        return x < rect.x + rect.width && y < rect.y + rect.height && x + width > rect.x && y + height > rect.y;
    }
}
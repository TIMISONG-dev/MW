package uniconteam.magicworld.attack;

import android.graphics.RectF;

public class CollisionRect {
    private RectF rect;

    public CollisionRect(float x, float y, float width, float height) {
        rect = new RectF(x, y, x + width, y + height);
    }

    public boolean isCollideWith(CollisionRect anotherRect) {
        return rect.intersect(anotherRect.rect);
    }
}
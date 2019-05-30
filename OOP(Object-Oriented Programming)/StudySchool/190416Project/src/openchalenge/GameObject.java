package openchalenge;

public class GameObject {
    protected int distance;
    protected int x, y;

    public GameObject(int startX, int startY, int distance) {
        this.x = startX;
        this.y = startY;
        this.distance = distance;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public boolean collide(GameObject p) {
        if (this.x == p.getX() && this.y == p.getY())
            return true;
        else
            return false;
    }

    public void move() {
        // TODO: 2019-04-16 abstract
    }

    public String getShape() {
        // TODO: 2019-04-16 abstract
        return "";
    }
}

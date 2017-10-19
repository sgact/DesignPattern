package Memento;

/**
 * Created by SG on 2017/10/19.
 */
public class Chessman {

    private String name;

    public Chessman(String name) {
        this.name = name;
    }

    private int x;

    private int y;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

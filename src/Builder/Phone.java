package Builder;

/**
 * Created by SG on 2017/10/12.
 */
public class Phone {

    private String ram;

    private String screen;

    private String Color;

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getScreen() {
        return screen;
    }

    public void setScreen(String screen) {
        this.screen = screen;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "ram='" + ram + '\'' +
                ", screen='" + screen + '\'' +
                ", Color='" + Color + '\'' +
                '}';
    }
}

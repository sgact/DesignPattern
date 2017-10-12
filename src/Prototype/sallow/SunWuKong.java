package Prototype.sallow;

/**
 * Created by SG on 2017/10/12.
 */
public class SunWuKong implements Cloneable{

    private String age = "500";

    private JinGuBang jinGuBang = new JinGuBang();

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public JinGuBang getJinGuBang() {
        return jinGuBang;
    }

    public SunWuKong clone(){
        Object sunWuKong = null;
        try {
            sunWuKong = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return (SunWuKong) sunWuKong;
    }
}

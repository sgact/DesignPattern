package State.States;

/**
 * Created by SG on 2017/10/19.
 */
public class VeryBadState extends State {
    @Override
    public boolean saveMoney() {
        System.out.println("正常存钱");
        return true;
    }

    @Override
    public void calculateInterest() {
        System.out.println("按天计算利息");
    }
}

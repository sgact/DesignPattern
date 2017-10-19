package State.States;

/**
 * Created by SG on 2017/10/19.
 */
public class NormalState extends State {

    @Override
    public boolean saveMoney() {
        System.out.println("正常存钱");
        return true;
    }

    @Override
    public boolean pullMoney() {
        System.out.println("正常取钱");
        return true;
    }

    @Override
    public void calculateInterest() {
        System.out.println("按年计算利息");
    }
}

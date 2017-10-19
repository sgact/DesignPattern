package State.States;

/**
 * Created by SG on 2017/10/19.
 */
public abstract class State {

    public boolean saveMoney(){
        System.out.println("账户异常");
        return false;
    };

    public boolean pullMoney(){
        System.out.println("账户异常");
        return false;
    }

    public void calculateInterest(){
        System.out.println("账户异常");
    }

}

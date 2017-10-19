package State;

import State.States.NormalState;
import State.States.OverdraftState;
import State.States.State;
import State.States.VeryBadState;

/**
 * Created by SG on 2017/10/19.
 */
public class Account {


    private State badState = new VeryBadState();
    private State overdraftState = new OverdraftState();
    private State normalState = new NormalState();

    private State state = normalState;

    private int balance;

    public void saveMoney(int moneyCnt){
        if (state.saveMoney()){
            balance += moneyCnt;
            updateState();
        }
    }

    public void pullMoney(int moneyCnt){
        if (state.pullMoney()){
            balance -= moneyCnt;
            updateState();
        }
    }

    public void checkInterests(){
        state.calculateInterest();
    }

    private void updateState() {
        if (balance >= 0){
            state = normalState;
        }else if (balance >= -2000){
            state = overdraftState;
        }else{
            state = badState;
        }
    }

}

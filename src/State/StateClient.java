package State;

/**
 * Created by SG on 2017/10/19.
 */
public class StateClient {

    public static void main(String[] argv){

        Account account = new Account();

        account.saveMoney(1000);

        currentAccState(account);

        account.pullMoney(2000);

        currentAccState(account);

        account.pullMoney(10000);

        currentAccState(account);

        account.saveMoney(65533);

        currentAccState(account);

    }

    public static void currentAccState(Account account){

        System.out.println("==============  START  ==================");

        account.pullMoney(1);
        account.saveMoney(1);
        account.checkInterests();

        System.out.println("==============  END  ==================");

    }

}

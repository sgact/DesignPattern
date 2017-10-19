package Strategy;

/**
 * Created by SG on 2017/10/19.
 */
public class StrategyClient {

    public static void main(String[] argv){

        Buyer buyer = new Buyer(new TransferMethod());
        buyer.buyTieck();

        Buyer buyer2 = new Buyer(new DirectMethod());
        buyer2.buyTieck();


    }
}

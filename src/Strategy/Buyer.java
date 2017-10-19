package Strategy;

/**
 * Created by SG on 2017/10/19.
 */
public class Buyer {

    private BuyTicketMethod method;

    public Buyer(BuyTicketMethod method) {
        this.method = method;
    }

    public void setMethod(BuyTicketMethod method) {
        this.method = method;
    }

    public void buyTieck(){
        System.out.println(method.buyTicker().getDesc());
    }
}

package Strategy;

/**
 * Created by SG on 2017/10/19.
 */
public class DirectMethod extends BuyTicketMethod {


    @Override
    public Ticket buyTicker() {
        return new Ticket("沈阳到北京");
    }
}

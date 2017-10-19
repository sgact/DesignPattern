package Strategy;

/**
 * Created by SG on 2017/10/19.
 */
public class TransferMethod extends BuyTicketMethod{

    @Override
    public Ticket buyTicker() {
        return new Ticket("沈阳到石家庄，石家庄到北京");
    }
}

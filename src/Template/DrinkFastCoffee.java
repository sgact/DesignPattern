package Template;

/**
 * Created by SG on 2017/10/19.
 */
public class DrinkFastCoffee extends DrinkCoffeeAlgo {
    @Override
    public void getCoffee() {
        System.out.println("自己泡一杯");
    }

    @Override
    public void addRelish() {
        System.out.println("加伴侣");
    }

    @Override
    public void mix() {
        System.out.println("使劲搅拌");
    }

    @Override
    public void drink() {
        System.out.println("大口喝");
    }
}

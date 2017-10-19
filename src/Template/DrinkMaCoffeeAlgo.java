package Template;

/**
 * Created by SG on 2017/10/19.
 */
public class DrinkMaCoffeeAlgo extends DrinkCoffeeAlgo {
    @Override
    public void getCoffee() {
        System.out.println("向服务员要咖啡");
    }

    @Override
    public void addRelish() {
        System.out.println("添加糖和奶精");
    }

    @Override
    public void mix() {
        System.out.println("使劲搅拌");
    }

    @Override
    public void drink() {
        System.out.println("用嘴喝");
    }
}

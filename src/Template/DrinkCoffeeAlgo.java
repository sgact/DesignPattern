package Template;

/**
 * Created by SG on 2017/10/19.
 */
public abstract class DrinkCoffeeAlgo {

    public void proceed(){

        getCoffee();
        addRelish();
        mix();
        drink();

    }

    public abstract void getCoffee();
    public abstract void addRelish();
    public abstract void mix();
    public abstract void drink();

}

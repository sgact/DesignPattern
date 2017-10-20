package Mediator;

/**
 * @author SG on 2017/10/20
 */
public class Mediator {

    private BlackGlasses blackGlasses = new BlackGlasses();

    private Newspaper newspaper = new Newspaper();

    public void reportBigNews(){
        blackGlasses.gettingAngry();
        newspaper.getBigNews();
    }



}

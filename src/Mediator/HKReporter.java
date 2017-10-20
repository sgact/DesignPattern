package Mediator;

/**
 * @author SG on 2017/10/20
 */
public class HKReporter {

    private Mediator mediator = new Mediator();

    public void report(){
        System.out.println("听风就是雨");
        mediator.reportBigNews();
    }

}

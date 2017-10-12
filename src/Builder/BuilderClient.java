package Builder;

/**
 * Created by SG on 2017/10/12.
 */
public class BuilderClient {

    public static void main(String[] argv){

        PhoneEngineer engineer = new PhoneEngineer();
        engineer.setBuilder(new XZBuilder());
        engineer.make();

        engineer.setBuilder(new Z3CBuilder());
        engineer.make();

    }
}

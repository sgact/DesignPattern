package Command;

import Command.Function.DeleteFunction;
import Command.Function.Function;
import Command.Function.RefactorFunction;
import Command.Function.RenameFunction;

/**
 * Created by SG on 2017/10/19.
 */
public class CommandClient {

    public static void main(String[] argv){


        testCommandQueue();
    }


    public static void testBasicCommand(){
        FunctionKey f1 = new FunctionKey("F1");
        FunctionKey f2 = new FunctionKey("F2");
        FunctionKey f3 = new FunctionKey("F3");

        f1.setFunction(new RefactorFunction());
        f2.setFunction(new RenameFunction());
        f3.setFunction(new DeleteFunction());

        f1.click();
        f2.click();
        f3.click();
    }

    public static void testCommandQueue(){

        CompositeFuctionKey fn = new CompositeFuctionKey("fn");

        fn.addFunction(new RefactorFunction());
        fn.addFunction(new DeleteFunction());

        fn.click();

    }
}

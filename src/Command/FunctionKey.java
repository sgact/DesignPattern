package Command;

import Command.Function.Function;

/**
 * Created by SG on 2017/10/19.
 */
public class FunctionKey {

    private String name;
    private Function function;

    public FunctionKey(String name) {
        this.name = name;
    }

    public void setFunction(Function function) {
        this.function = function;
    }

    public void click(){
        System.out.print("点击" + name + ",");
        if (function != null) {
            function.onFunctionCall();
        }
    }
}

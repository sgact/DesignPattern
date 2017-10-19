package Command;

import Command.Function.Function;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by SG on 2017/10/19.
 */
public class CompositeFuctionKey {
    private String name;
    private List<Function> functionList = new ArrayList<>();

    public CompositeFuctionKey(String name) {
        this.name = name;
    }

    public void addFunction(Function functionList) {
        this.functionList.add(functionList);
    }

    public void click(){
        System.out.print("点击" + name + ",");
        for (Function function : functionList){
            function.onFunctionCall();
        }
    }
}

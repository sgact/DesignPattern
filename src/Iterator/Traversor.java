package Iterator;

import java.util.List;
import java.util.NoSuchElementException;

/**
 * Created by SG on 2017/10/19.
 */
public class Traversor {


    private TraversableArray data;

    private int currentIndex = 0;

    public void setData(TraversableArray data) {
        this.data = data;
    }

    public boolean hasNext(){
        return currentIndex < data.length();
    }

    public int next(){
        if (hasNext()){
            return data.get(currentIndex++);
        }else {
            throw new NoSuchElementException();
        }
    }

    public void remove(){

        int[] deleteResult = new int[data.length() - 1];

        int cnt = 0;

        for (int i = 0; i < data.length(); i++){
            if (i != currentIndex){
                deleteResult[cnt++] = data.get(i);
            }
        }

        data.setData(deleteResult);
    }

}

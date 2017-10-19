package Iterator;

/**
 * Created by SG on 2017/10/19.
 */
public class TraversableArray {

    private int[] data = { 3, 3, 7, 8, 4, 5, 8, 1, 8};
    private Traversor traversor;

    public Traversor traversor(){
        return traversor;
    }

    public TraversableArray() {
        traversor = new Traversor();
        traversor.setData(this);
    }

    public void setData(int[] data) {
        this.data = data;
    }

    public int length(){
        return data.length;
    }

    public int get(int index){
        return data[index];
    }

}

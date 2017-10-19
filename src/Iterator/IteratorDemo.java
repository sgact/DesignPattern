package Iterator;


/**
 * Created by SG on 2017/10/19.
 */
public class IteratorDemo {

    public static void main(String[] argv){

        TraversableArray array = new TraversableArray();

        Traversor tr = array.traversor();

        while (tr.hasNext()){
            System.out.print(tr.next() + ", ");
        }

//        tr.next();
//        tr.next();
//        tr.next();
//
//        tr.remove();

//        while (tr.hasNext()){
//            System.out.print(tr.next() + ", ");
//        }




    }

}

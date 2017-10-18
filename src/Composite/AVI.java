package Composite;

/**
 * Created by SG on 2017/10/16.
 */
public class AVI extends File{

    public AVI(String fileName) {
        super(fileName);
    }

    @Override
    public void scanVirus() {
        System.out.println("正在杀毒 -> " +fileName + ".AVI");
    }
}

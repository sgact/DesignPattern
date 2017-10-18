package Composite;

/**
 * Created by SG on 2017/10/16.
 */
public class CompositeClient {

    public static void main(String[] argv){

        File fileToScan = initFolder();
        fileToScan.scanVirus();

    }

    private static File initFolder() {
        File root = new Folder("学习资料");
        File folder1 = new Folder("葫芦娃");
        File folder2 = new Folder("新闻联播");
        File folder3 = new Folder("新闻联播2017");
        File file1 = new AVI("爱的供养");

        folder1.addChild(new AVI("葫芦娃第一集"));
        folder1.addChild(new AVI("葫芦娃第二集"));

        folder2.addChild(new AVI("新闻联播sp1"));
        folder2.addChild(new AVI("新闻联播sp2"));

        folder3.addChild(new AVI("新闻联播201709"));

        folder2.addChild(folder3);

        root.addChild(folder1);
        root.addChild(folder2);
        root.addChild(file1);

        return root;
    }

}

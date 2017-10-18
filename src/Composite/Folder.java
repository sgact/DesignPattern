package Composite;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by SG on 2017/10/16.
 */
public class Folder extends File {

    public Folder(String fileName) {
        super(fileName);
    }

    @Override
    public void scanVirus() {
        System.out.println("正在杀毒文件夹 -> " + fileName);
        for (File file : childFiles){
            file.scanVirus();
        }
    }
}

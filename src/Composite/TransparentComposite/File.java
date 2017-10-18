package Composite.TransparentComposite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by SG on 2017/10/16.
 */
public abstract class File {

    protected String fileName;

    protected List<File> childFiles = new ArrayList<>();


    public File(String fileName) {
        this.fileName = fileName;
    }

    public void addChild(File file){
        //默认不支持，支持时需要重写
        System.out.println("不支持调用该方法");
    }

    public abstract void scanVirus();




}

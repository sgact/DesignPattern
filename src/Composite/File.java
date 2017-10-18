package Composite;

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

    protected void addChild(File file){
        childFiles.add(file);
    }

    public abstract void scanVirus();




}

package Proxy.CacheProxy;


/**
 * Created by SG on 2017/10/19.
 */
public class MemProxy extends Memeory{

    Disk disk = new Disk();
    Cache cache = new Cache();

    @Override
    public String readMemOf(String key) {

        if (cache.has(key)){
            String value = cache.readMemOf(key);
            System.out.println("从Cache中读取[" + key + "]其值为[" + value +"].");
        }else {
            String value = disk.readMemOf(key);
            System.out.println("从Disk中读取[" + key + "]其值为[" + value +"].");
            cache.put(key, value);
        }
        System.out.println();
        return null;
    }
}

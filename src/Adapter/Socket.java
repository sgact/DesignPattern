package Adapter;

/**
 * Created by SG on 2017/10/13.
 */
public class Socket {

    public final int outVoltage = 220;

    private AbsAdapter mAdapter;

    public void setmAdapter(AbsAdapter mAdapter) {
        this.mAdapter = mAdapter;
    }

    public void onLink(){
        if (mAdapter != null) {
            System.out.println("插入适配器");
            mAdapter.linkTarget(outVoltage);
        }
    }

}

package Adapter;

/**
 * Created by SG on 2017/10/13.
 */
public class AdapterClient {

    public static void main(String[] argv){

        Phone phone = new Phone();
        TV100V tv = new TV100V();
        TVAdapter tvAdapter = new TVAdapter();
        PhoneAdapter phoneAdapter = new PhoneAdapter();
        Socket socket = new Socket();


//        phoneAdapter.setChargable(phone);
//        socket.setmAdapter(phoneAdapter);
//        socket.onLink();

//        socket.setmAdapter(tvAdapter);
//        tvAdapter.setChargable(phone);
//        socket.onLink();

//        socket.setmAdapter(phoneAdapter);
//        phoneAdapter.setChargable(tv);
//        socket.onLink();


    }

}

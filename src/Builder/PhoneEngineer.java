package Builder;

/**
 * Created by SG on 2017/10/12.
 */
public class PhoneEngineer {

    private AbsBuilder builder;

    public void setBuilder(AbsBuilder builder){
        this.builder = builder;
    }

    public Phone make(){
        Phone phone =  builder.setColor().setRam().setScreen().assemble();
        System.out.println(phone.toString());
        return phone;
    }
}

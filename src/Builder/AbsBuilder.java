package Builder;

/**
 * Created by SG on 2017/10/12.
 */
public abstract class AbsBuilder {

    protected Phone phone = new Phone();

    public abstract AbsBuilder setRam();

    public abstract AbsBuilder setScreen();

    public abstract AbsBuilder setColor();

    public Phone assemble(){
        return phone;
    }



}

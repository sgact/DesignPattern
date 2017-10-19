package ChainOfResponsibility;

/**
 * Created by SG on 2017/10/19.
 */
public abstract class Leader {

    protected int handleDay;

    protected Leader nextLeader;

    public Leader setNextLeader(Leader nextLeader) {
        this.nextLeader = nextLeader;
        return nextLeader;
    }

    public abstract void handleStudentLeave(int day);

}

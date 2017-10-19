package ChainOfResponsibility;

/**
 * Created by SG on 2017/10/19.
 */
public class LeaderChain extends Leader {
    @Override
    public void handleStudentLeave(int day) {
        nextLeader.handleStudentLeave(day);
    }
}

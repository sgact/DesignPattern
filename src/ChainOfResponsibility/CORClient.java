package ChainOfResponsibility;

/**
 * Created by SG on 2017/10/19.
 */
public class CORClient {

    public static void main(String[] argv){

        Monitor monitor = new Monitor();
        SanDaoGang sanDaoGang = new SanDaoGang();
        Teacher teacher = new Teacher();
        SchoolMaster schoolMaster = new SchoolMaster();

        LeaderChain chain = new LeaderChain();

        chain.setNextLeader(monitor)
                .setNextLeader(sanDaoGang)
                .setNextLeader(teacher)
                .setNextLeader(schoolMaster);

        chain.handleStudentLeave(2);

        System.out.println();

        chain.handleStudentLeave(8);

        System.out.println();

        chain.handleStudentLeave(100);


    }

}

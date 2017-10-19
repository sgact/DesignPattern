package ChainOfResponsibility;

/**
 * Created by SG on 2017/10/19.
 */
public class SchoolMaster extends Leader {

    public SchoolMaster() {
        handleDay = DayConfig.SCHOOLMASTER_HANDLE_DAY;
    }

    @Override
    public void handleStudentLeave(int day) {
        if (day <= handleDay){
            System.out.println("校长处理了" + day + "天的请假条");

        }else{
            System.out.println("校长不能处理" + day + "天的请假条");
            if (nextLeader != null) {
                nextLeader.handleStudentLeave(day);
            }else{
                System.out.println("开除这个学生");
            }
        }
    }
}

package Observer;

/**
 * @author SG on 2017/10/20
 */
public class ObserverClient {

    public static void main(String[] argv){

        Mage mage = new Mage();
        Prist prist = new Prist();
        Shamman shamman = new Shamman();
        TeamLeader teamLeader = new TeamLeader();

        mage.setListener(teamLeader);
        prist.setListener(teamLeader);
        shamman.setListener(teamLeader);

        prist.underAttack();

    }
}

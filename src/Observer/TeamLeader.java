package Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author SG on 2017/10/20
 */
public class TeamLeader{

    List<Warrior> teamMember = new ArrayList<>();

    public void addMember(Warrior warrior){
        teamMember.add(warrior);
    }

    public void warriorUnderAttack(Warrior warrior) {
        System.out.println("团队领袖：保护我方" + warrior.getName());
        for (Warrior teammate : teamMember){
            if (teammate != warrior){
                teammate.assistTeamMate(warrior);
            }
        }
    }


}

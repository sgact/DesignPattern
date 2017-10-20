package Observer;

/**
 * @author SG on 2017/10/20
 */
public abstract class Warrior {

    public abstract String getName();

    TeamLeader listener;

    public void setListener(TeamLeader listener) {
        this.listener = listener;
        listener.addMember(this);
    }

    public void underAttack(){

        System.out.println(getName() + "受到攻击");

        if (listener != null) {
            listener.warriorUnderAttack(this);
        }
    }

    public abstract void assistTeamMate(Warrior warrior);
}

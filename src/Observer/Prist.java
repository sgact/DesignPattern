package Observer;

/**
 * @author SG on 2017/10/20
 */
public class Prist extends Warrior {
    @Override
    public String getName() {
        return "牧师";
    }

    @Override
    public void assistTeamMate(Warrior warrior) {
        System.out.println(getName() + "使用[苦修]治疗" + warrior.getName());
    }
}

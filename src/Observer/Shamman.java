package Observer;

/**
 * @author SG on 2017/10/20
 */
public class Shamman extends Warrior {

    @Override
    public String getName() {
        return "萨满";
    }

    @Override
    public void assistTeamMate(Warrior warrior) {
        System.out.println(getName() + "使用[医疗波]治疗" + warrior.getName());
    }
}

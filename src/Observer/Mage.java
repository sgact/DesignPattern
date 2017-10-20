package Observer;

/**
 * @author SG on 2017/10/20
 */
public class Mage extends Warrior {
    @Override
    public String getName() {
        return "法师";
    }

    @Override
    public void assistTeamMate(Warrior warrior) {
        System.out.println(getName() + "使用[造餐术]恢复" + warrior.getName());
    }
}

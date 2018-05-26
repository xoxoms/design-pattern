package strategy.weapon;

/**
 * Created by ms on 2018. 5. 26..
 */
public class AxeWeaponBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("fight with axe");
    }
}

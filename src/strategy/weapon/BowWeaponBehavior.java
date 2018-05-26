package strategy.weapon;

/**
 * Created by ms on 2018. 5. 26..
 */
public class BowWeaponBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("fight with bow");
    }
}

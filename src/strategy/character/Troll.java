package strategy.character;

import strategy.weapon.AxeWeaponBehavior;
import strategy.weapon.SwordWeaponBehavior;

/**
 * Created by ms on 2018. 5. 26..
 */
public class Troll extends Character {
    public Troll() {
        this.name = "Troll";
        this.weaponBehavior = new AxeWeaponBehavior();
    }

    @Override
    public void fightWithWeapon() {
        weaponBehavior.useWeapon();
    }
}

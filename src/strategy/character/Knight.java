package strategy.character;

import strategy.weapon.SwordWeaponBehavior;

/**
 * Created by ms on 2018. 5. 26..
 */
public class Knight extends Character {
    public Knight() {
        this.name = "Knight";
        this.weaponBehavior = new SwordWeaponBehavior();
    }

    @Override
    public void fightWithWeapon() {
        weaponBehavior.useWeapon();
    }
}

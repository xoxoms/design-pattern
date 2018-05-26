package strategy.character;

import strategy.weapon.WeaponBehavior;

/**
 * Created by ms on 2018. 5. 26..
 */
public class King extends Character {
    public King() {
        this.name = "King";
        this.weaponBehavior = null;
    }

    @Override
    public void fightWithWeapon() {
        System.out.println("can not fight.");
    }

    @Override
    public void setWeaponBehavior(WeaponBehavior weaponBehavior) {
        System.out.println("King can not wear weapon.");
    }
}

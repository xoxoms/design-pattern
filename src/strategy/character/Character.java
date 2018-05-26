package strategy.character;

import strategy.weapon.WeaponBehavior;

/**
 * Created by ms on 2018. 5. 26..
 */
public abstract class Character {
    protected String name;
    protected WeaponBehavior weaponBehavior;

    public void fight() {
        System.out.print(name + " ");
        fightWithWeapon();
    }
    public abstract void fightWithWeapon();
    public void setWeaponBehavior(WeaponBehavior weaponBehavior) {
        this.weaponBehavior = weaponBehavior;
    }
}

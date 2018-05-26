package strategy.character;

import strategy.weapon.BowWeaponBehavior;

/**
 * Created by ms on 2018. 5. 26..
 */
public class Archer extends Character {
    public Archer() {
        this.name = "Archer";
        this.weaponBehavior = new BowWeaponBehavior();
    }

    @Override
    public void fightWithWeapon() {
        weaponBehavior.useWeapon();
    }
}

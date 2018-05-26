package strategy;

import strategy.character.*;
import strategy.character.Character;
import strategy.weapon.SwordWeaponBehavior;

/**
 * Created by ms on 2018. 5. 26..
 */
public class Strategy {
    public static void main(String[] args) {
        Character king = new King();
        king.fight();

        Character knight = new Knight();
        knight.fight();

        Character archer = new Archer();
        archer.fight();

        Character troll = new Troll();
        troll.fight();

        troll.setWeaponBehavior(new SwordWeaponBehavior());
        troll.fight();

        king.setWeaponBehavior(new SwordWeaponBehavior());
        king.fight();
    }
}

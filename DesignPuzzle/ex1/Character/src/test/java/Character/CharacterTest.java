package Character;

import Weapon.AxeBehavior;
import Weapon.BowAndArrowBehavior;
import Weapon.KnifeBehavior;
import Weapon.SwordBehavior;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CharacterTest {
    Character p1;
    Character p2;
    Character p3;
    Character p4;
    @BeforeEach
    void setUp(){
        p1 = new King();
        p2 = new Knight();
        p3 = new Queen();
        p4 = new Troll();
    }


    @Test
    void fight() {
        p1.setWeaponBehavior(new SwordBehavior());
        p2.setWeaponBehavior(new AxeBehavior());
        p3.setWeaponBehavior(new BowAndArrowBehavior());
        p4.setWeaponBehavior(new KnifeBehavior());
        assertEquals("I use Sword",p1.fight());
        assertEquals("I use Axe",p2.fight());
        assertEquals("I use arrow",p3.fight());
        assertEquals("I use Knife",p4.fight());
    }
}
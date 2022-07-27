import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DuckTest {
    Duck modelduck;
    Duck greenduck;

    DuckCall dc;

    @BeforeEach
    void setUp(){
        modelduck = new ModelDuck(new FlyNotWay(),new MuteQuack());
        greenduck = new GreenDuck(new FlyWithWing(), new Quack());
        dc = new DuckCall();
    }


    @Test
    void setFlyBehavior() {
        modelduck.setFlyBehavior(new FlyRocketPowered());
        greenduck.setFlyBehavior(new FlyNotWay());
        Assertions.assertEquals("I'm flying with a rocket",modelduck.performfly());
        Assertions.assertEquals("I can't fly", greenduck.performfly());
    }

    @Test
    void setQuackBehavior() {
        modelduck.setQuackBehavior(new Quack());
        Assertions.assertEquals("Quack",modelduck.performquack());
    }

    @Test
    void swim() {
    }

    @Test
    void performfly() {
        Assertions.assertEquals("I can't fly",dc.performfly());
    }

    @Test
    void performquack() {
        Assertions.assertEquals("Quack",dc.performquack());
        Assertions.assertEquals("<<Silence>>",modelduck.performquack());
        Assertions.assertEquals("Quack",greenduck.performquack());
    }

    @Test
    void display() {
    }
}
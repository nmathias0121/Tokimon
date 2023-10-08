package src.com.nmathias.Tokimon.test;

import src.com.nmathias.Tokimon.java.Tokimon;

import static org.junit.jupiter.api.Assertions.*;

class TokimonTest {

    @org.junit.jupiter.api.Test
    void getName() {
        // empty name
        Tokimon t1 = new Tokimon("", "selenium", 166, 77,150);
        assertEquals(t1.getName(),"");

        // non empty name
        Tokimon t2 = new Tokimon("Qtoki", "selenium", 166, 77,150);
        assertEquals(t2.getName(),"Qtoki");
    }

    @org.junit.jupiter.api.Test
    void getType() {
        // empty type
        Tokimon t1 = new Tokimon("", "", 166, 77,150);
        assertEquals(t1.getType(),"");

        // non empty type
        Tokimon t2 = new Tokimon("Qtoki", "selenium", 166, 77,150);
        assertEquals(t2.getType(),"selenium");
    }

    @org.junit.jupiter.api.Test
    void getHeight() {
        // negative height
        Tokimon t1 = new Tokimon("Btoki", "selenium", -34, 77,150);
        assertEquals(t1.getHeight(),25);

        // zero height
        Tokimon t2 = new Tokimon("Btoki", "selenium", 0, 77,150);
        assertEquals(t2.getHeight(),25);

        // positive height
        Tokimon t3 = new Tokimon("Qtoki", "selenium", 166, 77,150);
        assertEquals(t3.getHeight(),166);
    }

    @org.junit.jupiter.api.Test
    void getWeight() {
        // negative weight
        Tokimon t1 = new Tokimon("Btoki", "selenium", 166, -20,150);
        assertEquals(t1.getWeight(),15);

        // zero weight
        Tokimon t2 = new Tokimon("Btoki", "selenium", 166, 0,150);
        assertEquals(t2.getWeight(),15);

        // positive weight
        Tokimon t3 = new Tokimon("Qtoki", "selenium", 166, 77,150);
        assertEquals(t3.getWeight(),77);
    }

    @org.junit.jupiter.api.Test
    void getStrength() {
        // negative strength
        Tokimon t1 = new Tokimon("Btoki", "selenium", 166, 77,-150);
        assertEquals(t1.getStrength(),-150);

        // zero strength
        Tokimon t2 = new Tokimon("Btoki", "selenium", 166, 77,0);
        assertEquals(t2.getStrength(),0);

        // positive strength
        Tokimon t3 = new Tokimon("Qtoki", "selenium", 166, 77,150);
        assertEquals(t3.getStrength(),150);
    }

    @org.junit.jupiter.api.Test
    void setStrength() {
        Tokimon t1 = new Tokimon("Qtoki", "selenium", 166, 77,0);
        t1.setStrength(-150);

        Tokimon t2 = new Tokimon("Qtoki", "selenium", 166, 77,0);
        t2.setStrength(40);

        Tokimon t3 = new Tokimon("Qtoki", "selenium", 166, 77,0);
        t3.setStrength(0);

        assertEquals(t1.getStrength(), -150);
        assertEquals(t2.getStrength(), 40);
        assertEquals(t3.getStrength(), 0);

    }

    @org.junit.jupiter.api.Test
    void testToString() {
    }
}
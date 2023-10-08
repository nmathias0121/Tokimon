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
        /*
        // negative height
        Tokimon t1 = new Tokimon("Btoki", "selenium", -34, 77,150);
        assertEquals(t1.getHeight(),166);

        // zero height
        Tokimon t1 = new Tokimon("Btoki", "selenium", 0, 77,150);
        assertEquals(t1.getHeight(),166);
        */


        // positive height
        Tokimon t2 = new Tokimon("Qtoki", "selenium", 166, 77,150);
        assertEquals(t2.getHeight(),166);
    }

    @org.junit.jupiter.api.Test
    void getWeight() {
    }

    @org.junit.jupiter.api.Test
    void getStrength() {
    }

    @org.junit.jupiter.api.Test
    void setStrength() {
    }

    @org.junit.jupiter.api.Test
    void testToString() {
    }
}
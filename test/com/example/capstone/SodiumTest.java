package com.example.capstone;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * This is the unit test for the element sodium
 */
class SodiumTest {
    @Test
    public void testsodium(){
        Sodium element = new Sodium();

        assertEquals("Sodium", element.getElementname());
        assertEquals(11, element.getAtomicnumber());
        assertEquals(22.9897693f, element.getAtomicmass());
        assertEquals(1, element.getGroupnumber());
        assertEquals(3, element.getPeriodnumber());
        assertEquals("Alkali Metal", element.getFamilyname());
        assertEquals("Na-base.png", element.getImagename());
    }

}
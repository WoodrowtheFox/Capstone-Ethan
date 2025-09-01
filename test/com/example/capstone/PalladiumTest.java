package com.example.capstone;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/**
 * This is the unit test for the element Palladium
 */
class PalladiumTest {
    @Test
    public void testPalladium(){
        Palladium element = new Palladium();

        assertEquals("Palladium", element.getElementname());
        assertEquals(46, element.getAtomicnumber());
        assertEquals(106.42f, element.getAtomicmass());
        assertEquals(10, element.getGroupnumber());
        assertEquals(5, element.getPeriodnumber());
        assertEquals("Transition Metal", element.getFamilyname());
        assertEquals("Pd-base.png", element.getImagename());
    }

}
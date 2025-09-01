package com.example.capstone;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/**
 * This is the unit test for the element Darmstadtium
 */
class DarmstadtiumTest {
    @Test
    public void testDarmstadtium(){
        Darmstadtium element = new Darmstadtium();

        assertEquals("Darmstadtium", element.getElementname());
        assertEquals(110, element.getAtomicnumber());
        assertEquals(282.166f, element.getAtomicmass());
        assertEquals(10, element.getGroupnumber());
        assertEquals(7, element.getPeriodnumber());
        assertEquals("Transition Metal", element.getFamilyname());
        assertEquals("Ds-base.png", element.getImagename());
    }

}
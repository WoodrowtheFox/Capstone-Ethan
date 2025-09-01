package com.example.capstone;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/**
 * This is the unit test for the element Francium
 */
class FranciumTest {
    @Test
    public void testFrancium(){
        Francium element = new Francium();

        assertEquals("Francium", element.getElementname());
        assertEquals(87, element.getAtomicnumber());
        assertEquals(223.01973f, element.getAtomicmass());
        assertEquals(1, element.getGroupnumber());
        assertEquals(7, element.getPeriodnumber());
        assertEquals("Alkali Metal", element.getFamilyname());
        assertEquals("Fr-base.png", element.getImagename());
    }

}
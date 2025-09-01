package com.example.capstone;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/**
 * This is the unit test for the element Dysprosium
 */
class DysprosiumTest {
    @Test
    public void testDysprosium(){
        Dysprosium element = new Dysprosium();

        assertEquals("Dysprosium", element.getElementname());
        assertEquals(66, element.getAtomicnumber());
        assertEquals(162.500f, element.getAtomicmass());
        assertEquals(13, element.getGroupnumber());
        assertEquals(6, element.getPeriodnumber());
        assertEquals("Lanthanide", element.getFamilyname());
        assertEquals("Dy-base.png", element.getImagename());
    }

}
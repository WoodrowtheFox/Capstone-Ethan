package com.example.capstone;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/**
 * This is the unit test for the element Polonium
 */
class PoloniumTest {
    @Test
    public void testPolonium(){
        Polonium element = new Polonium();

        assertEquals("Polonium", element.getElementname());
        assertEquals(84, element.getAtomicnumber());
        assertEquals(208.98243f, element.getAtomicmass());
        assertEquals(16, element.getGroupnumber());
        assertEquals(6, element.getPeriodnumber());
        assertEquals("Metalloid", element.getFamilyname());
        assertEquals("Po-base.png", element.getImagename());
    }

}
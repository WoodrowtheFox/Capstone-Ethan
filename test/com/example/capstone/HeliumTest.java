package com.example.capstone;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/**
 * This is the unit test for the element helium
 */
class HeliumTest {
    @Test
    public void testhelium(){
        Helium element = new Helium();

        assertEquals("Helium", element.getElementname());
        assertEquals(2, element.getAtomicnumber());
        assertEquals(4.0026f, element.getAtomicmass());
        assertEquals(18, element.getGroupnumber());
        assertEquals(1, element.getPeriodnumber());
        assertEquals("Noble Gas", element.getFamilyname());
        assertEquals("He-base.png", element.getImagename());
    }

}
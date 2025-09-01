package com.example.capstone;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/**
 * This is the unit test for the element Einsteinium
 */
class EinsteiniumTest {
    @Test
    public void testEinsteinium(){
        Einsteinium element = new Einsteinium();

        assertEquals("Einsteinium", element.getElementname());
        assertEquals(99, element.getAtomicnumber());
        assertEquals(252.0830f, element.getAtomicmass());
        assertEquals(14, element.getGroupnumber());
        assertEquals(7, element.getPeriodnumber());
        assertEquals("Actinide", element.getFamilyname());
        assertEquals("Es-base.png", element.getImagename());
    }

}
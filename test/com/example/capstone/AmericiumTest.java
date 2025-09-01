package com.example.capstone;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/**
 * This is the unit test for the element Americium
 */
class AmericiumTest {
    @Test
    public void testAmericium(){
        Americium element = new Americium();

        assertEquals("Americium", element.getElementname());
        assertEquals(95, element.getAtomicnumber());
        assertEquals(243.061380f, element.getAtomicmass());
        assertEquals(10, element.getGroupnumber());
        assertEquals(7, element.getPeriodnumber());
        assertEquals("Actinide", element.getFamilyname());
        assertEquals("Am-base.png", element.getImagename());
    }

}
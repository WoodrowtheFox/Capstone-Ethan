package com.example.capstone;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/**
 * This is the unit test for the element Beryllium
 */
class BerylliumTest {
    @Test
    public void testberyllium(){
        Beryllium element = new Beryllium();

        assertEquals("Beryllium", element.getElementname());
        assertEquals(4, element.getAtomicnumber());
        assertEquals(9.012183f, element.getAtomicmass());
        assertEquals(2, element.getGroupnumber());
        assertEquals(2, element.getPeriodnumber());
        assertEquals("Alkaline Earth Metal", element.getFamilyname());
        assertEquals("Be-base.png", element.getImagename());
    }
}
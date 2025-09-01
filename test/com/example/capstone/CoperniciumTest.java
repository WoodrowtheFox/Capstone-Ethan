package com.example.capstone;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/**
 * This is the unit test for the element Copernicium
 */
class CoperniciumTest {
    @Test
    public void testCopernicium(){
        Copernicium element = new Copernicium();

        assertEquals("Copernicium", element.getElementname());
        assertEquals(112, element.getAtomicnumber());
        assertEquals(286.179f, element.getAtomicmass());
        assertEquals(12, element.getGroupnumber());
        assertEquals(7, element.getPeriodnumber());
        assertEquals("Transition Metal", element.getFamilyname());
        assertEquals("Cn-base.png", element.getImagename());
    }

}
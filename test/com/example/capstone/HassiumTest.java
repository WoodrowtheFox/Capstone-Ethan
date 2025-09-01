package com.example.capstone;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/**
 * This is the unit test for the element Hassium
 */
class HassiumTest {
    @Test
    public void testHassium(){
        Hassium element = new Hassium();

        assertEquals("Hassium", element.getElementname());
        assertEquals(108, element.getAtomicnumber());
        assertEquals(269.1336f, element.getAtomicmass());
        assertEquals(8, element.getGroupnumber());
        assertEquals(7, element.getPeriodnumber());
        assertEquals("Transition Metal", element.getFamilyname());
        assertEquals("Hs-base.png", element.getImagename());
    }

}
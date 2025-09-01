package com.example.capstone;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/**
 * This is the unit test for the element Californium
 */
class CaliforniumTest {
    @Test
    public void testCalifornium(){
        Californium element = new Californium();

        assertEquals("Californium", element.getElementname());
        assertEquals(98, element.getAtomicnumber());
        assertEquals(251.07959f, element.getAtomicmass());
        assertEquals(13, element.getGroupnumber());
        assertEquals(7, element.getPeriodnumber());
        assertEquals("Actinide", element.getFamilyname());
        assertEquals("Cf-base.png", element.getImagename());
    }

}
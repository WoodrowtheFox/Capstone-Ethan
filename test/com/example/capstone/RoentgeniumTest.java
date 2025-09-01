package com.example.capstone;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/**
 * This is the unit test for the element Roentgenium
 */
class RoentgeniumTest {
    @Test
    public void testRoentgenium(){
        Roentgenium element = new Roentgenium();

        assertEquals("Roentgenium", element.getElementname());
        assertEquals(111, element.getAtomicnumber());
        assertEquals(282.169f, element.getAtomicmass());
        assertEquals(11, element.getGroupnumber());
        assertEquals(7, element.getPeriodnumber());
        assertEquals("Transition Metal", element.getFamilyname());
        assertEquals("Rg-base.png", element.getImagename());
    }

}
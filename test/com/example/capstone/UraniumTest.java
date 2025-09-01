package com.example.capstone;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/**
 * This is the unit test for the element Uranium
 */
class UraniumTest {
    @Test
    public void testUranium(){
        Uranium element = new Uranium();

        assertEquals("Uranium", element.getElementname());
        assertEquals(92, element.getAtomicnumber());
        assertEquals(238.0289f, element.getAtomicmass());
        assertEquals(7, element.getGroupnumber());
        assertEquals(7, element.getPeriodnumber());
        assertEquals("Actinide", element.getFamilyname());
        assertEquals("U-base.png", element.getImagename());
    }

}
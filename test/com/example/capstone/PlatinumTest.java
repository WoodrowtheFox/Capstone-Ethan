package com.example.capstone;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/**
 * This is the unit test for the element Platinum
 */
class PlatinumTest {
    @Test
    public void testPlatinum(){
        Platinum element = new Platinum();

        assertEquals("Platinum", element.getElementname());
        assertEquals(78, element.getAtomicnumber());
        assertEquals(195.08f, element.getAtomicmass());
        assertEquals(10, element.getGroupnumber());
        assertEquals(6, element.getPeriodnumber());
        assertEquals("Transition Metal", element.getFamilyname());
        assertEquals("Pt-base.png", element.getImagename());
    }

}
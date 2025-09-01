package com.example.capstone;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/**
 * This is the unit test for the element Chromium
 */
class ChromiumTest {
    @Test
    public void testChromium(){
        Chromium element = new Chromium();

        assertEquals("Chromium", element.getElementname());
        assertEquals(24, element.getAtomicnumber());
        assertEquals(51.996f, element.getAtomicmass());
        assertEquals(6, element.getGroupnumber());
        assertEquals(4, element.getPeriodnumber());
        assertEquals("Transition Metal", element.getFamilyname());
        assertEquals("Cr-base.png", element.getImagename());
    }

}
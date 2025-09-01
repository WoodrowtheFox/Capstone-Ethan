package com.example.capstone;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/**
 * This is the unit test for the element Flerovium
 */
class FleroviumTest {
    @Test
    public void testFlerovium(){
        Flerovium element = new Flerovium();

        assertEquals("Flerovium", element.getElementname());
        assertEquals(114, element.getAtomicnumber());
        assertEquals(290.192f, element.getAtomicmass());
        assertEquals(14, element.getGroupnumber());
        assertEquals(7, element.getPeriodnumber());
        assertEquals("Post-Transition Metal", element.getFamilyname());
        assertEquals("Fl-base.png", element.getImagename());
    }

}
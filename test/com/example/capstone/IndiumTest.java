package com.example.capstone;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/**
 * This is the unit test for the element Indium
 */
class IndiumTest {
    @Test
    public void testIndium(){
        Indium element = new Indium();

        assertEquals("Indium", element.getElementname());
        assertEquals(49, element.getAtomicnumber());
        assertEquals(114.818f, element.getAtomicmass());
        assertEquals(13, element.getGroupnumber());
        assertEquals(5, element.getPeriodnumber());
        assertEquals("Post-Transition Metal", element.getFamilyname());
        assertEquals("In-base.png", element.getImagename());
    }

}
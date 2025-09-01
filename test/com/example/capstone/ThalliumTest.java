package com.example.capstone;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/**
 * This is the unit test for the element Thallium
 */
class ThalliumTest {
    @Test
    public void testThallium(){
        Thallium element = new Thallium();

        assertEquals("Thallium", element.getElementname());
        assertEquals(81, element.getAtomicnumber());
        assertEquals(204.383f, element.getAtomicmass());
        assertEquals(13, element.getGroupnumber());
        assertEquals(6, element.getPeriodnumber());
        assertEquals("Post-Transition Metal", element.getFamilyname());
        assertEquals("Tl-base.png", element.getImagename());
    }

}
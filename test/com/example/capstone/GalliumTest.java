package com.example.capstone;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/**
 * This is the unit test for the element Gallium
 */
class GalliumTest {
    @Test
    public void testGallium(){
        Gallium element = new Gallium();

        assertEquals("Gallium", element.getElementname());
        assertEquals(31, element.getAtomicnumber());
        assertEquals(69.723f, element.getAtomicmass());
        assertEquals(13, element.getGroupnumber());
        assertEquals(4, element.getPeriodnumber());
        assertEquals("Post-transition Metal", element.getFamilyname());
        assertEquals("Ga-base.png", element.getImagename());
    }

}
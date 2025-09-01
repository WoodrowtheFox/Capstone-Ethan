package com.example.capstone;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/**
 * This is the unit test for the element Oganesson
 */
class OganessonTest {
    @Test
    public void testOganesson(){
        Oganesson element = new Oganesson();

        assertEquals("Oganesson", element.getElementname());
        assertEquals(118, element.getAtomicnumber());
        assertEquals(295.216f, element.getAtomicmass());
        assertEquals(18, element.getGroupnumber());
        assertEquals(7, element.getPeriodnumber());
        assertEquals("Noble Gas", element.getFamilyname());
        assertEquals("Og-base.png", element.getImagename());
    }

}
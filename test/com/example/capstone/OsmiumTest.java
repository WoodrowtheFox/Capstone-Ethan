package com.example.capstone;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/**
 * This is the unit test for the element Osmium
 */
class OsmiumTest {
    @Test
    public void testOsmium(){
        Osmium element = new Osmium();

        assertEquals("Osmium", element.getElementname());
        assertEquals(76, element.getAtomicnumber());
        assertEquals(190.2f, element.getAtomicmass());
        assertEquals(8, element.getGroupnumber());
        assertEquals(6, element.getPeriodnumber());
        assertEquals("Transition Metal", element.getFamilyname());
        assertEquals("Os-base.png", element.getImagename());
    }

}
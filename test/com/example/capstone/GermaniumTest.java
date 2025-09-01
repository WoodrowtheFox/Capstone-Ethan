package com.example.capstone;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/**
 * This is the unit test for the element Germanium
 */
class GermaniumTest {
    @Test
    public void testGermanium(){
        Germanium element = new Germanium();

        assertEquals("Germanium", element.getElementname());
        assertEquals(32, element.getAtomicnumber());
        assertEquals(72.63f, element.getAtomicmass());
        assertEquals(14, element.getGroupnumber());
        assertEquals(4, element.getPeriodnumber());
        assertEquals("Metalloid", element.getFamilyname());
        assertEquals("Ge-base.png", element.getImagename());
    }

}
package com.example.capstone;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/**
 * This is the unit test for the element Vanadium
 */
class VanadiumTest {
    @Test
    public void testVanadium(){
        Vanadium element = new Vanadium();

        assertEquals("Vanadium", element.getElementname());
        assertEquals(23, element.getAtomicnumber());
        assertEquals(50.9415f, element.getAtomicmass());
        assertEquals(5, element.getGroupnumber());
        assertEquals(4, element.getPeriodnumber());
        assertEquals("Transition Metal", element.getFamilyname());
        assertEquals("V-base.png", element.getImagename());
    }

}
package com.example.capstone;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/**
 * This is the unit test for the element Rutherfordium
 */
class RutherfordiumTest {
    @Test
    public void testRutherfordium(){
        Rutherfordium element = new Rutherfordium();

        assertEquals("Rutherfordium", element.getElementname());
        assertEquals(104, element.getAtomicnumber());
        assertEquals(267.122f, element.getAtomicmass());
        assertEquals(4, element.getGroupnumber());
        assertEquals(7, element.getPeriodnumber());
        assertEquals("Transition Metal", element.getFamilyname());
        assertEquals("Rf-base.png", element.getImagename());
    }

}
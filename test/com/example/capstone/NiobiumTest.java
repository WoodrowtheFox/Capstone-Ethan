package com.example.capstone;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/**
 * This is the unit test for the element Niobium
 */
class NiobiumTest {
    @Test
    public void testNiobium(){
        Niobium element = new Niobium();

        assertEquals("Niobium", element.getElementname());
        assertEquals(41, element.getAtomicnumber());
        assertEquals(92.90637f, element.getAtomicmass());
        assertEquals(5, element.getGroupnumber());
        assertEquals(5, element.getPeriodnumber());
        assertEquals("Transition Metal", element.getFamilyname());
        assertEquals("Nb-base.png", element.getImagename());
    }

}
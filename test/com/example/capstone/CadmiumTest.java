package com.example.capstone;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/**
 * This is the unit test for the element Cadmium
 */
class CadmiumTest {
    @Test
    public void testCadmium(){
        Cadmium element = new Cadmium();

        assertEquals("Cadmium", element.getElementname());
        assertEquals(48, element.getAtomicnumber());
        assertEquals(112.41f, element.getAtomicmass());
        assertEquals(12, element.getGroupnumber());
        assertEquals(5, element.getPeriodnumber());
        assertEquals("Transition Metal", element.getFamilyname());
        assertEquals("Cd-base.png", element.getImagename());
    }

}
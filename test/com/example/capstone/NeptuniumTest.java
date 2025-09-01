package com.example.capstone;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/**
 * This is the unit test for the element Neptunium
 */
class NeptuniumTest {
    @Test
    public void testNeptunium(){
        Neptunium element = new Neptunium();

        assertEquals("Neptunium", element.getElementname());
        assertEquals(93, element.getAtomicnumber());
        assertEquals(237.048172f, element.getAtomicmass());
        assertEquals(8, element.getGroupnumber());
        assertEquals(7, element.getPeriodnumber());
        assertEquals("Actinide", element.getFamilyname());
        assertEquals("Np-base.png", element.getImagename());
    }

}
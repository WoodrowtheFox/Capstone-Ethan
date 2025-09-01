package com.example.capstone;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/**
 * This is the unit test for the element Radium
 */
class RadiumTest {
    @Test
    public void testRadium(){
        Radium element = new Radium();

        assertEquals("Radium", element.getElementname());
        assertEquals(88, element.getAtomicnumber());
        assertEquals(226.02541f, element.getAtomicmass());
        assertEquals(2, element.getGroupnumber());
        assertEquals(7, element.getPeriodnumber());
        assertEquals("Alkaline Earth Metal", element.getFamilyname());
        assertEquals("Ra-base.png", element.getImagename());
    }

}
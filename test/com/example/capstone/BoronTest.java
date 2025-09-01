package com.example.capstone;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/**
 * This is the unit test for the element Boron
 */
class BoronTest {
    @Test
    public void testboron(){
        Boron element = new Boron();

        assertEquals("Boron", element.getElementname());
        assertEquals(5, element.getAtomicnumber());
        assertEquals(10.81f, element.getAtomicmass());
        assertEquals(13, element.getGroupnumber());
        assertEquals(2, element.getPeriodnumber());
        assertEquals("Metalloid", element.getFamilyname());
        assertEquals("B-base.png", element.getImagename());
    }
}
package com.example.capstone;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/**
 * This is the unit test for the element Molybdenum
 */
class MolybdenumTest {
    @Test
    public void testMolybdenum(){
        Molybdenum element = new Molybdenum();

        assertEquals("Molybdenum", element.getElementname());
        assertEquals(42, element.getAtomicnumber());
        assertEquals(95.95f, element.getAtomicmass());
        assertEquals(6, element.getGroupnumber());
        assertEquals(5, element.getPeriodnumber());
        assertEquals("Transition Metal", element.getFamilyname());
        assertEquals("Mo-base.png", element.getImagename());
    }

}
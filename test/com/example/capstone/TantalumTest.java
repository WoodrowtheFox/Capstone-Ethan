package com.example.capstone;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/**
 * This is the unit test for the element Tantalum
 */
class TantalumTest {
    @Test
    public void testTantalum(){
        Tantalum element = new Tantalum();

        assertEquals("Tantalum", element.getElementname());
        assertEquals(73, element.getAtomicnumber());
        assertEquals(180.9479f, element.getAtomicmass());
        assertEquals(5, element.getGroupnumber());
        assertEquals(6, element.getPeriodnumber());
        assertEquals("Transition Metal", element.getFamilyname());
        assertEquals("Ta-base.png", element.getImagename());
    }

}
package com.example.capstone;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/**
 * This is the unit test for the element hydrogen
 */
class HydrogenTest {
    @Test
    public void testhydrogen(){
        Hydrogen element = new Hydrogen();

        assertEquals("Hydrogen", element.getElementname());
        assertEquals(1, element.getAtomicnumber());
        assertEquals(1.008f, element.getAtomicmass());
        assertEquals(1, element.getGroupnumber());
        assertEquals(1, element.getPeriodnumber());
        assertEquals("Reactive Non-Metal", element.getFamilyname());
        assertEquals("H-base.png", element.getImagename());
    }

}
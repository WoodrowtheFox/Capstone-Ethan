package com.example.capstone;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/**
 * This is the unit test for the element Krypton
 */
class KryptonTest {
    @Test
    public void testKrypton(){
        Krypton element = new Krypton();

        assertEquals("Krypton", element.getElementname());
        assertEquals(36, element.getAtomicnumber());
        assertEquals(83.80f, element.getAtomicmass());
        assertEquals(18, element.getGroupnumber());
        assertEquals(4, element.getPeriodnumber());
        assertEquals("Noble Gas", element.getFamilyname());
        assertEquals("Kr-base.png", element.getImagename());
    }

}
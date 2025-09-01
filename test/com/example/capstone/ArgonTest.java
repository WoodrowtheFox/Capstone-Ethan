package com.example.capstone;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/**
 * This is the unit test for the element argon
 */
class ArgonTest {
    @Test
    public void testArgon(){
        Argon element = new Argon();

        assertEquals("Argon", element.getElementname());
        assertEquals(18, element.getAtomicnumber());
        assertEquals(39.9f, element.getAtomicmass());
        assertEquals(18, element.getGroupnumber());
        assertEquals(3, element.getPeriodnumber());
        assertEquals("Noble Gas", element.getFamilyname());
        assertEquals("Ar-base.png", element.getImagename());
    }

}
package com.example.capstone;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/**
 * This is the unit test for the element Bismuth
 */
class BismuthTest {
    @Test
    public void testBismuth(){
        Bismuth element = new Bismuth();

        assertEquals("Bismuth", element.getElementname());
        assertEquals(83, element.getAtomicnumber());
        assertEquals(208.98040f, element.getAtomicmass());
        assertEquals(15, element.getGroupnumber());
        assertEquals(6, element.getPeriodnumber());
        assertEquals("Post-Transition Metal", element.getFamilyname());
        assertEquals("Bi-base.png", element.getImagename());
    }

}
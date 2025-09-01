package com.example.capstone;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/**
 * This is the unit test for the element Tin
 */
class TinTest {
    @Test
    public void testTin(){
        Tin element = new Tin();

        assertEquals("Tin", element.getElementname());
        assertEquals(50, element.getAtomicnumber());
        assertEquals(118.71f, element.getAtomicmass());
        assertEquals(14, element.getGroupnumber());
        assertEquals(5, element.getPeriodnumber());
        assertEquals("Post-Transition Metal", element.getFamilyname());
        assertEquals("Sn-base.png", element.getImagename());
    }

}
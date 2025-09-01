package com.example.capstone;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/**
 * This is the unit test for the element Scandium
 */
class ScandiumTest {
    @Test
    public void testScandium(){
        Scandium element = new Scandium();

        assertEquals("Scandium", element.getElementname());
        assertEquals(21, element.getAtomicnumber());
        assertEquals(44.95591f, element.getAtomicmass());
        assertEquals(3, element.getGroupnumber());
        assertEquals(4, element.getPeriodnumber());
        assertEquals("Transition Metal", element.getFamilyname());
        assertEquals("Sc-base.png", element.getImagename());
    }

}
package com.example.capstone;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/**
 * This is the unit test for the element Holmium
 */
class HolmiumTest {
    @Test
    public void testHolmium(){
        Holmium element = new Holmium();

        assertEquals("Holmium", element.getElementname());
        assertEquals(67, element.getAtomicnumber());
        assertEquals(164.93033f, element.getAtomicmass());
        assertEquals(14, element.getGroupnumber());
        assertEquals(6, element.getPeriodnumber());
        assertEquals("Lanthanide", element.getFamilyname());
        assertEquals("Ho-base.png", element.getImagename());
    }

}
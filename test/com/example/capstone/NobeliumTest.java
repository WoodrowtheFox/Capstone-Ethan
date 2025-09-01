package com.example.capstone;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/**
 * This is the unit test for the element Nobelium
 */
class NobeliumTest {
    @Test
    public void testNobelium(){
        Nobelium element = new Nobelium();

        assertEquals("Nobelium", element.getElementname());
        assertEquals(102, element.getAtomicnumber());
        assertEquals(259.10100f, element.getAtomicmass());
        assertEquals(17, element.getGroupnumber());
        assertEquals(7, element.getPeriodnumber());
        assertEquals("Actinide", element.getFamilyname());
        assertEquals("No-base.png", element.getImagename());
    }

}
package com.example.capstone;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/**
 * This is the unit test for the element Neodymium
 */
class NeodymiumTest {
    @Test
    public void testNeodymium(){
        Neodymium element = new Neodymium();

        assertEquals("Neodymium", element.getElementname());
        assertEquals(60, element.getAtomicnumber());
        assertEquals(144.24f, element.getAtomicmass());
        assertEquals(7, element.getGroupnumber());
        assertEquals(6, element.getPeriodnumber());
        assertEquals("Lanthanide", element.getFamilyname());
        assertEquals("Nd-base.png", element.getImagename());
    }

}
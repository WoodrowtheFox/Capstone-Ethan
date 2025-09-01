package com.example.capstone;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/**
 * This is the unit test for the element Europium
 */
class EuropiumTest {
    @Test
    public void testEuropium(){
        Europium element = new Europium();

        assertEquals("Europium", element.getElementname());
        assertEquals(63, element.getAtomicnumber());
        assertEquals(151.964f, element.getAtomicmass());
        assertEquals(10, element.getGroupnumber());
        assertEquals(6, element.getPeriodnumber());
        assertEquals("Lanthanide", element.getFamilyname());
        assertEquals("Eu-base.png", element.getImagename());
    }

}
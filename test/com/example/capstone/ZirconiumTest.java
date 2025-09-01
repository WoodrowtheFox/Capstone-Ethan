package com.example.capstone;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/**
 * This is the unit test for the element Zirconium
 */
class ZirconiumTest {
    @Test
    public void testZirconium(){
        Zirconium element = new Zirconium();

        assertEquals("Zirconium", element.getElementname());
        assertEquals(40, element.getAtomicnumber());
        assertEquals(91.22f, element.getAtomicmass());
        assertEquals(4, element.getGroupnumber());
        assertEquals(5, element.getPeriodnumber());
        assertEquals("Transition Metal", element.getFamilyname());
        assertEquals("Zr-base.png", element.getImagename());
    }

}
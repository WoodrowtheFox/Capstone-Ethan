package com.example.capstone;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/**
 * This is the unit test for the element Terbium
 */
class TerbiumTest {
    @Test
    public void testTerbium(){
        Terbium element = new Terbium();

        assertEquals("Terbium", element.getElementname());
        assertEquals(65, element.getAtomicnumber());
        assertEquals(158.92535f, element.getAtomicmass());
        assertEquals(12, element.getGroupnumber());
        assertEquals(6, element.getPeriodnumber());
        assertEquals("Lanthanide", element.getFamilyname());
        assertEquals("Tb-base.png", element.getImagename());
    }

}
package com.example.capstone;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/**
 * This is the unit test for the element Fermium
 */
class FermiumTest {
    @Test
    public void testFermium(){
        Fermium element = new Fermium();

        assertEquals("Fermium", element.getElementname());
        assertEquals(100, element.getAtomicnumber());
        assertEquals(257.09511f, element.getAtomicmass());
        assertEquals(15, element.getGroupnumber());
        assertEquals(7, element.getPeriodnumber());
        assertEquals("Actinide", element.getFamilyname());
        assertEquals("Fm-base.png", element.getImagename());
    }

}
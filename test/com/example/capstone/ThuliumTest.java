package com.example.capstone;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/**
 * This is the unit test for the element Thulium
 */
class ThuliumTest {
    @Test
    public void testThulium(){
        Thulium element = new Thulium();

        assertEquals("Thulium", element.getElementname());
        assertEquals(69, element.getAtomicnumber());
        assertEquals(168.93422f, element.getAtomicmass());
        assertEquals(16, element.getGroupnumber());
        assertEquals(6, element.getPeriodnumber());
        assertEquals("Lanthanide", element.getFamilyname());
        assertEquals("Tm-base.png", element.getImagename());
    }

}
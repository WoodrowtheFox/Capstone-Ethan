package com.example.capstone;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/**
 * This is the unit test for the element Thorium
 */
class ThoriumTest {
    @Test
    public void testThorium(){
        Thorium element = new Thorium();

        assertEquals("Thorium", element.getElementname());
        assertEquals(90, element.getAtomicnumber());
        assertEquals(232.038f, element.getAtomicmass());
        assertEquals(5, element.getGroupnumber());
        assertEquals(7, element.getPeriodnumber());
        assertEquals("Actinide", element.getFamilyname());
        assertEquals("Th-base.png", element.getImagename());
    }

}
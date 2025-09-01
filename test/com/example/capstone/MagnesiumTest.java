package com.example.capstone;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * This is the unit test for the element Magnesium
 */
class MagnesiumTest {
    @Test
    public void testmagnesium(){
        Magnesium element = new Magnesium();

        assertEquals("Magnesium", element.getElementname());
        assertEquals(12, element.getAtomicnumber());
        assertEquals(24.305f, element.getAtomicmass());
        assertEquals(2, element.getGroupnumber());
        assertEquals(3, element.getPeriodnumber());
        assertEquals("Alkaline Earth Metal", element.getFamilyname());
        assertEquals("Mg-base.png", element.getImagename());
    }

}
package com.example.capstone;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/**
 * This is the unit test for the element Radon
 */
class RadonTest {
    @Test
    public void testRadon(){
        Radon element = new Radon();

        assertEquals("Radon", element.getElementname());
        assertEquals(86, element.getAtomicnumber());
        assertEquals(222.01758f, element.getAtomicmass());
        assertEquals(18, element.getGroupnumber());
        assertEquals(6, element.getPeriodnumber());
        assertEquals("Noble Gas", element.getFamilyname());
        assertEquals("Rn-base.png", element.getImagename());
    }

}
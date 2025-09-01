package com.example.capstone;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * This is the unit test for the element carbon
 */
class CarbonTest{
    @Test
    public void testcarbon(){
        Carbon element = new Carbon();

        assertEquals("Carbon", element.getElementname());
        assertEquals(6, element.getAtomicnumber());
        assertEquals(12.011f, element.getAtomicmass());
        assertEquals(14, element.getGroupnumber());
        assertEquals(2, element.getPeriodnumber());
        assertEquals("Nonmetal", element.getFamilyname());
        assertEquals("C-base.png", element.getImagename());
    }
}
package com.example.capstone;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/**
 * This is the unit test for the element Strontium
 */
class StrontiumTest {
    @Test
    public void testStrontium(){
        Strontium element = new Strontium();

        assertEquals("Strontium", element.getElementname());
        assertEquals(38, element.getAtomicnumber());
        assertEquals(87.62f, element.getAtomicmass());
        assertEquals(2, element.getGroupnumber());
        assertEquals(5, element.getPeriodnumber());
        assertEquals("Alkaline Earth Metal", element.getFamilyname());
        assertEquals("Sr-base.png", element.getImagename());
    }

}
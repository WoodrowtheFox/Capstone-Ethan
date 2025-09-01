package com.example.capstone;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/**
 * This is the unit test for the element Rhenium
 */
class RheniumTest {
    @Test
    public void testRhenium(){
        Rhenium element = new Rhenium();

        assertEquals("Rhenium", element.getElementname());
        assertEquals(75, element.getAtomicnumber());
        assertEquals(186.207f, element.getAtomicmass());
        assertEquals(7, element.getGroupnumber());
        assertEquals(6, element.getPeriodnumber());
        assertEquals("Transition Metal", element.getFamilyname());
        assertEquals("Re-base.png", element.getImagename());
    }

}
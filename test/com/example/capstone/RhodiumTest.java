package com.example.capstone;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/**
 * This is the unit test for the element Rhodium
 */
class RhodiumTest {
    @Test
    public void testRhodium(){
        Rhodium element = new Rhodium();

        assertEquals("Rhodium", element.getElementname());
        assertEquals(45, element.getAtomicnumber());
        assertEquals(102.9055f, element.getAtomicmass());
        assertEquals(9, element.getGroupnumber());
        assertEquals(5, element.getPeriodnumber());
        assertEquals("Transition Metal", element.getFamilyname());
        assertEquals("Rh-base.png", element.getImagename());
    }

}
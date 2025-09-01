package com.example.capstone;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/**
 * This is the unit test for the element Moscovium
 */
class MoscoviumTest {
    @Test
    public void testMoscovium(){
        Moscovium element = new Moscovium();

        assertEquals("Moscovium", element.getElementname());
        assertEquals(115, element.getAtomicnumber());
        assertEquals(290.196f, element.getAtomicmass());
        assertEquals(15, element.getGroupnumber());
        assertEquals(7, element.getPeriodnumber());
        assertEquals("Post-Transition Metal", element.getFamilyname());
        assertEquals("Mc-base.png", element.getImagename());
    }

}
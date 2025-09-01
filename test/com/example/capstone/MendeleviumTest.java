package com.example.capstone;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/**
 * This is the unit test for the element Mendelevium
 */
class MendeleviumTest {
    @Test
    public void testMendelevium(){
        Mendelevium element = new Mendelevium();

        assertEquals("Mendelevium", element.getElementname());
        assertEquals(101, element.getAtomicnumber());
        assertEquals(258.09843f, element.getAtomicmass());
        assertEquals(16, element.getGroupnumber());
        assertEquals(7, element.getPeriodnumber());
        assertEquals("Actinide", element.getFamilyname());
        assertEquals("Md-base.png", element.getImagename());
    }

}
package com.example.capstone;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/**
 * This is the unit test for the element Promethium
 */
class PromethiumTest {
    @Test
    public void testPromethium(){
        Promethium element = new Promethium();

        assertEquals("Promethium", element.getElementname());
        assertEquals(61, element.getAtomicnumber());
        assertEquals(144.91276f, element.getAtomicmass());
        assertEquals(8, element.getGroupnumber());
        assertEquals(6, element.getPeriodnumber());
        assertEquals("Lanthanide", element.getFamilyname());
        assertEquals("Pm-base.png", element.getImagename());
    }

}
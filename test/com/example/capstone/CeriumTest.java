package com.example.capstone;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/**
 * This is the unit test for the element Cerium
 */
class CeriumTest {
    @Test
    public void testCerium(){
        Cerium element = new Cerium();

        assertEquals("Cerium", element.getElementname());
        assertEquals(58, element.getAtomicnumber());
        assertEquals(140.116f, element.getAtomicmass());
        assertEquals(5, element.getGroupnumber());
        assertEquals(6, element.getPeriodnumber());
        assertEquals("Lanthanide", element.getFamilyname());
        assertEquals("Ce-base.png", element.getImagename());
    }

}
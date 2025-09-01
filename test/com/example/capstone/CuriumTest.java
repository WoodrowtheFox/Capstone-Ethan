package com.example.capstone;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/**
 * This is the unit test for the element Curium
 */
class CuriumTest {
    @Test
    public void testCurium(){
        Curium element = new Curium();

        assertEquals("Curium", element.getElementname());
        assertEquals(96, element.getAtomicnumber());
        assertEquals(247.07035f, element.getAtomicmass());
        assertEquals(11, element.getGroupnumber());
        assertEquals(7, element.getPeriodnumber());
        assertEquals("Actinide", element.getFamilyname());
        assertEquals("Cm-base.png", element.getImagename());
    }

}
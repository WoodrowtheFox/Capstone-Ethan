package com.example.capstone;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/**
 * This is the unit test for the element Meitnerium
 */
class MeitneriumTest {
    @Test
    public void testMeitnerium(){
        Meitnerium element = new Meitnerium();

        assertEquals("Meitnerium", element.getElementname());
        assertEquals(109, element.getAtomicnumber());
        assertEquals(277.154f, element.getAtomicmass());
        assertEquals(9, element.getGroupnumber());
        assertEquals(7, element.getPeriodnumber());
        assertEquals("Transition Metal", element.getFamilyname());
        assertEquals("Mt-base.png", element.getImagename());
    }

}
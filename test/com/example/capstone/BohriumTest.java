package com.example.capstone;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/**
 * This is the unit test for the element Bohrium
 */
class BohriumTest {
    @Test
    public void testBohrium(){
        Bohrium element = new Bohrium();

        assertEquals("Bohrium", element.getElementname());
        assertEquals(107, element.getAtomicnumber());
        assertEquals(270.133f, element.getAtomicmass());
        assertEquals(7, element.getGroupnumber());
        assertEquals(7, element.getPeriodnumber());
        assertEquals("Transition Metal", element.getFamilyname());
        assertEquals("Bh-base.png", element.getImagename());
    }

}
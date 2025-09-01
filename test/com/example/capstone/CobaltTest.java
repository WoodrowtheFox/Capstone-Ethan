package com.example.capstone;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/**
 * This is the unit test for the element Cobalt
 */
class CobaltTest {
    @Test
    public void testCobalt(){
        Cobalt element = new Cobalt();

        assertEquals("Cobalt", element.getElementname());
        assertEquals(27, element.getAtomicnumber());
        assertEquals(58.93319f, element.getAtomicmass());
        assertEquals(9, element.getGroupnumber());
        assertEquals(4, element.getPeriodnumber());
        assertEquals("Transition Metal", element.getFamilyname());
        assertEquals("Co-base.png", element.getImagename());
    }

}
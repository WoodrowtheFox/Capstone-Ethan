package com.example.capstone;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/**
 * This is the unit test for the element Copper
 */
class CopperTest {
    @Test
    public void testCopper(){
        Copper element = new Copper();

        assertEquals("Copper", element.getElementname());
        assertEquals(29, element.getAtomicnumber());
        assertEquals(63.55f, element.getAtomicmass());
        assertEquals(11, element.getGroupnumber());
        assertEquals(4, element.getPeriodnumber());
        assertEquals("Transition Metal", element.getFamilyname());
        assertEquals("Cu-base.png", element.getImagename());
    }

}
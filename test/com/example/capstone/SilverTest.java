package com.example.capstone;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/**
 * This is the unit test for the element Silver
 */
class SilverTest {
    @Test
    public void testSilver(){
        Silver element = new Silver();

        assertEquals("Silver", element.getElementname());
        assertEquals(47, element.getAtomicnumber());
        assertEquals(107.868f, element.getAtomicmass());
        assertEquals(11, element.getGroupnumber());
        assertEquals(5, element.getPeriodnumber());
        assertEquals("Transition Metal", element.getFamilyname());
        assertEquals("Ag-base.png", element.getImagename());
    }

}
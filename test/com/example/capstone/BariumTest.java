package com.example.capstone;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/**
 * This is the unit test for the element Barium
 */
class BariumTest {
    @Test
    public void testBarium(){
        Barium element = new Barium();

        assertEquals("Barium", element.getElementname());
        assertEquals(56, element.getAtomicnumber());
        assertEquals(137.33f, element.getAtomicmass());
        assertEquals(2, element.getGroupnumber());
        assertEquals(6, element.getPeriodnumber());
        assertEquals("Alkaline Earth Metal", element.getFamilyname());
        assertEquals("Ba-base.png", element.getImagename());
    }

}
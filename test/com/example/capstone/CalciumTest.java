package com.example.capstone;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/**
 * This is the unit test for the element Calcium
 */
class CalciumTest {
    @Test
    public void testCalcium(){
        Calcium element = new Calcium();

        assertEquals("Calcium", element.getElementname());
        assertEquals(20, element.getAtomicnumber());
        assertEquals(40.08f, element.getAtomicmass());
        assertEquals(2, element.getGroupnumber());
        assertEquals(4, element.getPeriodnumber());
        assertEquals("Alkaline Earth Metal", element.getFamilyname());
        assertEquals("Ca-base.png", element.getImagename());
    }

}
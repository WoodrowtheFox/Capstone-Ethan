package com.example.capstone;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/**
 * This is the unit test for the element Praseodymium
 */
class PraseodymiumTest {
    @Test
    public void testPraseodymium(){
        Praseodymium element = new Praseodymium();

        assertEquals("Praseodymium", element.getElementname());
        assertEquals(59, element.getAtomicnumber());
        assertEquals(140.90766f, element.getAtomicmass());
        assertEquals(6, element.getGroupnumber());
        assertEquals(6, element.getPeriodnumber());
        assertEquals("Lanthanide", element.getFamilyname());
        assertEquals("Pr-base.png", element.getImagename());
    }

}
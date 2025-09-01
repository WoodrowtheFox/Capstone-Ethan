package com.example.capstone;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/**
 * This is the unit test for the element Berkelium
 */
class BerkeliumTest {
    @Test
    public void testBerkelium(){
        Berkelium element = new Berkelium();

        assertEquals("Berkelium", element.getElementname());
        assertEquals(97, element.getAtomicnumber());
        assertEquals(247.07031f, element.getAtomicmass());
        assertEquals(12, element.getGroupnumber());
        assertEquals(7, element.getPeriodnumber());
        assertEquals("Actinide", element.getFamilyname());
        assertEquals("Bk-base.png", element.getImagename());
    }

}
package com.example.capstone;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/**
 * This is the unit test for the element Xenon
 */
class XenonTest {
    @Test
    public void testXenon(){
        Xenon element = new Xenon();

        assertEquals("Xenon", element.getElementname());
        assertEquals(54, element.getAtomicnumber());
        assertEquals(131.29f, element.getAtomicmass());
        assertEquals(18, element.getGroupnumber());
        assertEquals(5, element.getPeriodnumber());
        assertEquals("Noble Gas", element.getFamilyname());
        assertEquals("Xe-base.png", element.getImagename());
    }

}
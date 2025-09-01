package com.example.capstone;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/**
 * This is the unit test for the element Lanthanum
 */
class LanthanumTest {
    @Test
    public void testLanthanum(){
        Lanthanum element = new Lanthanum();

        assertEquals("Lanthanum", element.getElementname());
        assertEquals(57, element.getAtomicnumber());
        assertEquals(138.9055f, element.getAtomicmass());
        assertEquals(4, element.getGroupnumber());
        assertEquals(6, element.getPeriodnumber());
        assertEquals("Lanthanide", element.getFamilyname());
        assertEquals("La-base.png", element.getImagename());
    }

}
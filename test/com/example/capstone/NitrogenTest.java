package com.example.capstone;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * This is the unit test for the element nitrogen
 */
class NitrogenTest {
    @Test
    public void testnitrogen(){
        Nitrogen element = new Nitrogen();

        assertEquals("Nitrogen", element.getElementname());
        assertEquals(7, element.getAtomicnumber());
        assertEquals(14.007f, element.getAtomicmass());
        assertEquals(15, element.getGroupnumber());
        assertEquals(2, element.getPeriodnumber());
        assertEquals("Nonmetal", element.getFamilyname());
        assertEquals("N-base.png", element.getImagename());
    }

}
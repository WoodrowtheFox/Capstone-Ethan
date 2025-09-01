package com.example.capstone;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/**
 * This is the unit test for the element Chlorine
 */
class ChlorineTest {
    @Test
    public void testChlorine(){
        Chlorine element = new Chlorine();

        assertEquals("Chlorine", element.getElementname());
        assertEquals(17, element.getAtomicnumber());
        assertEquals(35.45f, element.getAtomicmass());
        assertEquals(17, element.getGroupnumber());
        assertEquals(3, element.getPeriodnumber());
        assertEquals("Halogen", element.getFamilyname());
        assertEquals("Cl-base.png", element.getImagename());
    }

}
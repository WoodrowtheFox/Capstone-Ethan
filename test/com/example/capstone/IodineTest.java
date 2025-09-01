package com.example.capstone;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/**
 * This is the unit test for the element Iodine
 */
class IodineTest {
    @Test
    public void testIodine(){
        Iodine element = new Iodine();

        assertEquals("Iodine", element.getElementname());
        assertEquals(53, element.getAtomicnumber());
        assertEquals(126.9045f, element.getAtomicmass());
        assertEquals(17, element.getGroupnumber());
        assertEquals(5, element.getPeriodnumber());
        assertEquals("Halogen", element.getFamilyname());
        assertEquals("I-base.png", element.getImagename());
    }

}
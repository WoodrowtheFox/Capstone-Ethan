package com.example.capstone;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/**
 * This is the unit test for the element Tennessine
 */
class TennessineTest {
    @Test
    public void testTennessine(){
        Tennessine element = new Tennessine();

        assertEquals("Tennessine", element.getElementname());
        assertEquals(117, element.getAtomicnumber());
        assertEquals(294.211f, element.getAtomicmass());
        assertEquals(17, element.getGroupnumber());
        assertEquals(7, element.getPeriodnumber());
        assertEquals("Halogen", element.getFamilyname());
        assertEquals("Ts-base.png", element.getImagename());
    }

}
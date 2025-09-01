package com.example.capstone;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/**
 * This is the unit test for the element Mercury
 */
class MercuryTest {
    @Test
    public void testMercury(){
        Mercury element = new Mercury();

        assertEquals("Mercury", element.getElementname());
        assertEquals(80, element.getAtomicnumber());
        assertEquals(200.59f, element.getAtomicmass());
        assertEquals(12, element.getGroupnumber());
        assertEquals(6, element.getPeriodnumber());
        assertEquals("Transition Metal", element.getFamilyname());
        assertEquals("Hg-base.png", element.getImagename());
    }

}
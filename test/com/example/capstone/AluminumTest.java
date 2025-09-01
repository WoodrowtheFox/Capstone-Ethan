package com.example.capstone;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/**
 * This is the unit test for the element Aluminum
 */
class AluminumTest {
    @Test
    public void testaluminum(){
        Aluminum element = new Aluminum();

        assertEquals("Aluminum", element.getElementname());
        assertEquals(13, element.getAtomicnumber());
        assertEquals(26.981538f, element.getAtomicmass());
        assertEquals(13, element.getGroupnumber());
        assertEquals(3, element.getPeriodnumber());
        assertEquals("Post-Transition Metal", element.getFamilyname());
        assertEquals("Al-base.png", element.getImagename());
    }

}
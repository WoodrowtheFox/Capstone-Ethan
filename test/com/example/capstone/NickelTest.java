package com.example.capstone;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/**
 * This is the unit test for the element Nickel
 */
class NickelTest {
    @Test
    public void testNickel(){
        Nickel element = new Nickel();

        assertEquals("Nickel", element.getElementname());
        assertEquals(28, element.getAtomicnumber());
        assertEquals(58.693f, element.getAtomicmass());
        assertEquals(10, element.getGroupnumber());
        assertEquals(4, element.getPeriodnumber());
        assertEquals("Transition Metal", element.getFamilyname());
        assertEquals("Ni-base.png", element.getImagename());
    }

}
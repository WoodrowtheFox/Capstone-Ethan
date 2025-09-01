package com.example.capstone;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/**
 * This is the unit test for the element Seaborgium
 */
class SeaborgiumTest {
    @Test
    public void testSeaborgium(){
        Seaborgium element = new Seaborgium();

        assertEquals("Seaborgium", element.getElementname());
        assertEquals(106, element.getAtomicnumber());
        assertEquals(269.128f, element.getAtomicmass());
        assertEquals(6, element.getGroupnumber());
        assertEquals(7, element.getPeriodnumber());
        assertEquals("Transition Metal", element.getFamilyname());
        assertEquals("Sg-base.png", element.getImagename());
    }

}
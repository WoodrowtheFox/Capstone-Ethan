package com.example.capstone;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/**
 * This is the unit test for the element Ruthenium
 */
class RutheniumTest {
    @Test
    public void testRuthenium(){
        Ruthenium element = new Ruthenium();

        assertEquals("Ruthenium", element.getElementname());
        assertEquals(44, element.getAtomicnumber());
        assertEquals(101.1f, element.getAtomicmass());
        assertEquals(8, element.getGroupnumber());
        assertEquals(5, element.getPeriodnumber());
        assertEquals("Transition Metal", element.getFamilyname());
        assertEquals("Ru-base.png", element.getImagename());
    }

}
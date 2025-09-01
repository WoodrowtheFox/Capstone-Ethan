package com.example.capstone;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/**
 * This is the unit test for the element potassium
 */
class PotassiumTest {
    @Test
    public void testPotassium(){
        Potassium element = new Potassium();

        assertEquals("Potassium", element.getElementname());
        assertEquals(19, element.getAtomicnumber());
        assertEquals(39.0983f, element.getAtomicmass());
        assertEquals(1, element.getGroupnumber());
        assertEquals(4, element.getPeriodnumber());
        assertEquals("Alkali Metal", element.getFamilyname());
        assertEquals("K-base.png", element.getImagename());
    }

}
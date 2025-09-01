package com.example.capstone;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/**
 * This is the unit test for the element Rubidium
 */
class RubidiumTest {
    @Test
    public void testRubidium(){
        Rubidium element = new Rubidium();

        assertEquals("Rubidium", element.getElementname());
        assertEquals(37, element.getAtomicnumber());
        assertEquals(85.468f, element.getAtomicmass());
        assertEquals(1, element.getGroupnumber());
        assertEquals(5, element.getPeriodnumber());
        assertEquals("Alkali Metal", element.getFamilyname());
        assertEquals("Rb-base.png", element.getImagename());
    }

}
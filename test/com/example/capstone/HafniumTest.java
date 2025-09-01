package com.example.capstone;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/**
 * This is the unit test for the element Hafnium
 */
class HafniumTest {
    @Test
    public void testHafnium(){
        Hafnium element = new Hafnium();

        assertEquals("Hafnium", element.getElementname());
        assertEquals(72, element.getAtomicnumber());
        assertEquals(178.49f, element.getAtomicmass());
        assertEquals(4, element.getGroupnumber());
        assertEquals(6, element.getPeriodnumber());
        assertEquals("Transition Metal", element.getFamilyname());
        assertEquals("Hf-base.png", element.getImagename());
    }

}
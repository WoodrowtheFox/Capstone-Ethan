package com.example.capstone;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/**
 * This is the unit test for the element Titanium
 */
class TitaniumTest {
    @Test
    public void testTitanium(){
        Titanium element = new Titanium();

        assertEquals("Titanium", element.getElementname());
        assertEquals(22, element.getAtomicnumber());
        assertEquals(47.867f, element.getAtomicmass());
        assertEquals(4, element.getGroupnumber());
        assertEquals(4, element.getPeriodnumber());
        assertEquals("Transition Metal", element.getFamilyname());
        assertEquals("Ti-base.png", element.getImagename());
    }

}
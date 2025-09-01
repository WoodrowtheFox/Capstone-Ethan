package com.example.capstone;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/**
 * This is the unit test for the element Iridium
 */
class IridiumTest {
    @Test
    public void testIridium(){
        Iridium element = new Iridium();

        assertEquals("Iridium", element.getElementname());
        assertEquals(77, element.getAtomicnumber());
        assertEquals(192.22f, element.getAtomicmass());
        assertEquals(9, element.getGroupnumber());
        assertEquals(6, element.getPeriodnumber());
        assertEquals("Transition Metal", element.getFamilyname());
        assertEquals("Ir-base.png", element.getImagename());
    }

}
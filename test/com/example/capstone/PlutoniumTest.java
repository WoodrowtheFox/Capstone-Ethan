package com.example.capstone;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/**
 * This is the unit test for the element Plutonium
 */
class PlutoniumTest {
    @Test
    public void testPlutonium(){
        Plutonium element = new Plutonium();

        assertEquals("Plutonium", element.getElementname());
        assertEquals(94, element.getAtomicnumber());
        assertEquals(244.06420f, element.getAtomicmass());
        assertEquals(9, element.getGroupnumber());
        assertEquals(7, element.getPeriodnumber());
        assertEquals("Actinide", element.getFamilyname());
        assertEquals("Pu-base.png", element.getImagename());
    }

}
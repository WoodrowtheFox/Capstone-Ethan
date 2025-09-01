package com.example.capstone;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/**
 * This is the unit test for the element Lutetium
 */
class LutetiumTest {
    @Test
    public void testLutetium(){
        Lutetium element = new Lutetium();

        assertEquals("Lutetium", element.getElementname());
        assertEquals(71, element.getAtomicnumber());
        assertEquals(174.9667f, element.getAtomicmass());
        assertEquals(18, element.getGroupnumber());
        assertEquals(6, element.getPeriodnumber());
        assertEquals("Lanthanide", element.getFamilyname());
        assertEquals("Lu-base.png", element.getImagename());
    }

}
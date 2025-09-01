package com.example.capstone;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/**
 * This is the unit test for the element Zinc
 */
class ZincTest {
    @Test
    public void testZinc(){
        Zinc element = new Zinc();

        assertEquals("Zinc", element.getElementname());
        assertEquals(30, element.getAtomicnumber());
        assertEquals(65.4f, element.getAtomicmass());
        assertEquals(12, element.getGroupnumber());
        assertEquals(4, element.getPeriodnumber());
        assertEquals("Transition Metal", element.getFamilyname());
        assertEquals("Zn-base.png", element.getImagename());
    }

}
package com.example.capstone;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/**
 * This is the unit test for the element Ytterbium
 */
class YtterbiumTest {
    @Test
    public void testYtterbium(){
        Ytterbium element = new Ytterbium();

        assertEquals("Ytterbium", element.getElementname());
        assertEquals(70, element.getAtomicnumber());
        assertEquals(173.05f, element.getAtomicmass());
        assertEquals(17, element.getGroupnumber());
        assertEquals(6, element.getPeriodnumber());
        assertEquals("Lanthanide", element.getFamilyname());
        assertEquals("Yb-base.png", element.getImagename());
    }

}
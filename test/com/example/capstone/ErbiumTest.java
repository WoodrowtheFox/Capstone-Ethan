package com.example.capstone;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/**
 * This is the unit test for the element Erbium
 */
class ErbiumTest {
    @Test
    public void testErbium(){
        Erbium element = new Erbium();

        assertEquals("Erbium", element.getElementname());
        assertEquals(68, element.getAtomicnumber());
        assertEquals(167.26f, element.getAtomicmass());
        assertEquals(15, element.getGroupnumber());
        assertEquals(6, element.getPeriodnumber());
        assertEquals("Lanthanide", element.getFamilyname());
        assertEquals("Er-base.png", element.getImagename());
    }

}
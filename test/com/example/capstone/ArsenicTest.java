package com.example.capstone;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/**
 * This is the unit test for the element Arsenic
 */
class ArsenicTest {
    @Test
    public void testArsenic(){
        Arsenic element = new Arsenic();

        assertEquals("Arsenic", element.getElementname());
        assertEquals(33, element.getAtomicnumber());
        assertEquals(74.92159f, element.getAtomicmass());
        assertEquals(15, element.getGroupnumber());
        assertEquals(4, element.getPeriodnumber());
        assertEquals("Metalloid", element.getFamilyname());
        assertEquals("As-base.png", element.getImagename());
    }

}
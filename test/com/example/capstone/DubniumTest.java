package com.example.capstone;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/**
 * This is the unit test for the element Dubnium
 */
class DubniumTest {
    @Test
    public void testDubnium(){
        Dubnium element = new Dubnium();

        assertEquals("Dubnium", element.getElementname());
        assertEquals(105, element.getAtomicnumber());
        assertEquals(268.126f, element.getAtomicmass());
        assertEquals(5, element.getGroupnumber());
        assertEquals(7, element.getPeriodnumber());
        assertEquals("Transition Metal", element.getFamilyname());
        assertEquals("Db-base.png", element.getImagename());
    }

}
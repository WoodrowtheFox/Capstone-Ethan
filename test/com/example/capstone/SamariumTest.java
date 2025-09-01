package com.example.capstone;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/**
 * This is the unit test for the element Samarium
 */
class SamariumTest {
    @Test
    public void testSamarium(){
        Samarium element = new Samarium();

        assertEquals("Samarium", element.getElementname());
        assertEquals(62, element.getAtomicnumber());
        assertEquals(150.4f, element.getAtomicmass());
        assertEquals(9, element.getGroupnumber());
        assertEquals(6, element.getPeriodnumber());
        assertEquals("Lanthanide", element.getFamilyname());
        assertEquals("Sm-base.png", element.getImagename());
    }

}
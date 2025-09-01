package com.example.capstone;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/**
 * This is the unit test for the element Tellurium
 */
class TelluriumTest {
    @Test
    public void testTellurium(){
        Tellurium element = new Tellurium();

        assertEquals("Tellurium", element.getElementname());
        assertEquals(52, element.getAtomicnumber());
        assertEquals(127.6f, element.getAtomicmass());
        assertEquals(16, element.getGroupnumber());
        assertEquals(5, element.getPeriodnumber());
        assertEquals("Metalloid", element.getFamilyname());
        assertEquals("Te-base.png", element.getImagename());
    }

}
package com.example.capstone;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/**
 * This is the unit test for the element Protactinium
 */
class ProtactiniumTest {
    @Test
    public void testProtactinium(){
        Protactinium element = new Protactinium();

        assertEquals("Protactinium", element.getElementname());
        assertEquals(91, element.getAtomicnumber());
        assertEquals(231.03588f, element.getAtomicmass());
        assertEquals(6, element.getGroupnumber());
        assertEquals(7, element.getPeriodnumber());
        assertEquals("Actinide", element.getFamilyname());
        assertEquals("Pa-base.png", element.getImagename());
    }

}
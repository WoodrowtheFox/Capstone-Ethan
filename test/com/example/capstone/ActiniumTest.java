package com.example.capstone;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/**
 * This is the unit test for the element Actinium
 */
class ActiniumTest {
    @Test
    public void testActinium(){
        Actinium element = new Actinium();

        assertEquals("Actinium", element.getElementname());
        assertEquals(89, element.getAtomicnumber());
        assertEquals(227.02775f, element.getAtomicmass());
        assertEquals(4, element.getGroupnumber());
        assertEquals(7, element.getPeriodnumber());
        assertEquals("Actinide", element.getFamilyname());
        assertEquals("Ac-base.png", element.getImagename());
    }

}
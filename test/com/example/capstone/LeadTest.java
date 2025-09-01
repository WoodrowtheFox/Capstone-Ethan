package com.example.capstone;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/**
 * This is the unit test for the element Lead
 */
class LeadTest {
    @Test
    public void testLead(){
        Lead element = new Lead();

        assertEquals("Lead", element.getElementname());
        assertEquals(82, element.getAtomicnumber());
        assertEquals(207f, element.getAtomicmass());
        assertEquals(14, element.getGroupnumber());
        assertEquals(6, element.getPeriodnumber());
        assertEquals("Post-Transition Metal", element.getFamilyname());
        assertEquals("Pb-base.png", element.getImagename());
    }

}
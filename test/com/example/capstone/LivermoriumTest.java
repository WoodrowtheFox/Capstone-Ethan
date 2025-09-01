package com.example.capstone;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/**
 * This is the unit test for the element Livermorium
 */
class LivermoriumTest {
    @Test
    public void testLivermorium(){
        Livermorium element = new Livermorium();

        assertEquals("Livermorium", element.getElementname());
        assertEquals(116, element.getAtomicnumber());
        assertEquals(293.205f, element.getAtomicmass());
        assertEquals(16, element.getGroupnumber());
        assertEquals(7, element.getPeriodnumber());
        assertEquals("Post-Transition Metal", element.getFamilyname());
        assertEquals("Lv-base.png", element.getImagename());
    }

}
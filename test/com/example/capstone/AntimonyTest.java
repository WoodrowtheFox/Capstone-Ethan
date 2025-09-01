package com.example.capstone;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/**
 * This is the unit test for the element Antimony
 */
class AntimonyTest {
    @Test
    public void testAntimony(){
        Antimony element = new Antimony();

        assertEquals("Antimony", element.getElementname());
        assertEquals(51, element.getAtomicnumber());
        assertEquals(121.760f, element.getAtomicmass());
        assertEquals(15, element.getGroupnumber());
        assertEquals(5, element.getPeriodnumber());
        assertEquals("Metalloid", element.getFamilyname());
        assertEquals("Sb-base.png", element.getImagename());
    }

}
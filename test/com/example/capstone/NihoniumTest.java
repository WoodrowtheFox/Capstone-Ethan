package com.example.capstone;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/**
 * This is the unit test for the element Nihonium
 */
class NihoniumTest {
    @Test
    public void testNihonium(){
        Nihonium element = new Nihonium();

        assertEquals("Nihonium", element.getElementname());
        assertEquals(113, element.getAtomicnumber());
        assertEquals(286.182f, element.getAtomicmass());
        assertEquals(13, element.getGroupnumber());
        assertEquals(7, element.getPeriodnumber());
        assertEquals("Post-Transition Metal", element.getFamilyname());
        assertEquals("Nh-base.png", element.getImagename());
    }

}
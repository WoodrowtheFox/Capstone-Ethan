package com.example.capstone;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/**
 * This is the unit test for the element Technetium
 */
class TechnetiumTest {
    @Test
    public void testTechnetium(){
        Technetium element = new Technetium();

        assertEquals("Technetium", element.getElementname());
        assertEquals(43, element.getAtomicnumber());
        assertEquals(96.90636f, element.getAtomicmass());
        assertEquals(7, element.getGroupnumber());
        assertEquals(5, element.getPeriodnumber());
        assertEquals("Transition Metal", element.getFamilyname());
        assertEquals("Tc-base.png", element.getImagename());
    }

}
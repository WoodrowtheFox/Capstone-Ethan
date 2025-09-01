package com.example.capstone;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/**
 * This is the unit test for the element Lawrencium
 */
class LawrenciumTest {
    @Test
    public void testLawrencium(){
        Lawrencium element = new Lawrencium();

        assertEquals("Lawrencium", element.getElementname());
        assertEquals(103, element.getAtomicnumber());
        assertEquals(266.120f, element.getAtomicmass());
        assertEquals(18, element.getGroupnumber());
        assertEquals(7, element.getPeriodnumber());
        assertEquals("Actinide", element.getFamilyname());
        assertEquals("Lr-base.png", element.getImagename());
    }

}
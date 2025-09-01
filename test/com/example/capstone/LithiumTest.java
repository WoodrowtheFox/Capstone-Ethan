package com.example.capstone;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/**
 * This is the unit test for the element Lithium
 */
class LithiumTest {
    @Test
    public void testlithium(){
        Lithium element = new Lithium();

        assertEquals("Lithium", element.getElementname());
        assertEquals(3, element.getAtomicnumber());
        assertEquals(7.0f, element.getAtomicmass());
        assertEquals(1, element.getGroupnumber());
        assertEquals(2, element.getPeriodnumber());
        assertEquals("Alkali Metal", element.getFamilyname());
        assertEquals("Li-base.png", element.getImagename());

}}
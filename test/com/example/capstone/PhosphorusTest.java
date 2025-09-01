package com.example.capstone;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/**
 * This is the unit test for the element Phosphorus
 */
class PhosphorusTest {
    @Test
    public void testhydrogen(){
        Phosphorus element = new Phosphorus();

        assertEquals("Phosphorus", element.getElementname());
        assertEquals(15, element.getAtomicnumber());
        assertEquals(30.97376200f, element.getAtomicmass());
        assertEquals(15, element.getGroupnumber());
        assertEquals(3, element.getPeriodnumber());
        assertEquals("Nonmetal", element.getFamilyname());
        assertEquals("P-base.png", element.getImagename());
    }

}
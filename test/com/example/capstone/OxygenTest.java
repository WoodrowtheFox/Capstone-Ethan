package com.example.capstone;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * This is the unit test for the element oxygen
 */
class OxygenTest {
    @Test
    public void testoxygen(){
        Oxygen element = new Oxygen();

        assertEquals("Oxygen", element.getElementname());
        assertEquals(8, element.getAtomicnumber());
        assertEquals(15.999f, element.getAtomicmass());
        assertEquals(16, element.getGroupnumber());
        assertEquals(2, element.getPeriodnumber());
        assertEquals("Nonmetal", element.getFamilyname());
        assertEquals("O-base.png", element.getImagename());
    }}
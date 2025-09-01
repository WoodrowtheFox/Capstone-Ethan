package com.example.capstone;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * This is the unit test for the element Fluorine
 */
class FluorineTest{
    @Test
    public void testfluorine(){
        Fluorine element = new Fluorine();

        assertEquals("Fluorine", element.getElementname());
        assertEquals(9, element.getAtomicnumber());
        assertEquals(18.99840316f, element.getAtomicmass());
        assertEquals(17, element.getGroupnumber());
        assertEquals(2, element.getPeriodnumber());
        assertEquals("Halogen", element.getFamilyname());
        assertEquals("F-base.png", element.getImagename());
    }}
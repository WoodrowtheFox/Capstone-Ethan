package com.example.capstone;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/**
 * This is the unit test for the element Gadolinium
 */
class GadoliniumTest {
    @Test
    public void testGadolinium(){
        Gadolinium element = new Gadolinium();

        assertEquals("Gadolinium", element.getElementname());
        assertEquals(64, element.getAtomicnumber());
        assertEquals(157.25f, element.getAtomicmass());
        assertEquals(11, element.getGroupnumber());
        assertEquals(6, element.getPeriodnumber());
        assertEquals("Lanthanide", element.getFamilyname());
        assertEquals("Gd-base.png", element.getImagename());
    }}

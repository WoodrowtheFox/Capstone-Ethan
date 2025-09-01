package com.example.capstone;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * This is the unit test for the element Neon
 */
class NeonTest {
    @Test
    public void testneon(){
        Neon element = new Neon();

        assertEquals("Neon", element.getElementname());
        assertEquals(10, element.getAtomicnumber());
        assertEquals(20.180f, element.getAtomicmass());
        assertEquals(18, element.getGroupnumber());
        assertEquals(2, element.getPeriodnumber());
        assertEquals("Noble Gas", element.getFamilyname());
        assertEquals("Ne-base.png", element.getImagename());
    }}
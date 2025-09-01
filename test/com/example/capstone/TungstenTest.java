package com.example.capstone;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/**
 * This is the unit test for the element Tungsten
 */
class TungstenTest {
    @Test
    public void testTungsten(){
        Tungsten element = new Tungsten();

        assertEquals("Tungsten", element.getElementname());
        assertEquals(74, element.getAtomicnumber());
        assertEquals(183.84f, element.getAtomicmass());
        assertEquals(6, element.getGroupnumber());
        assertEquals(6, element.getPeriodnumber());
        assertEquals("Transition Metal", element.getFamilyname());
        assertEquals("W-base.png", element.getImagename());
    }

}
package com.example.capstone;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/**
 * This is the unit test for the element silicon
 */
class SiliconTest {
    @Test
    public void testsilicon(){
        Silicon element = new Silicon();

        assertEquals("Silicon", element.getElementname());
        assertEquals(14, element.getAtomicnumber());
        assertEquals(28.085f, element.getAtomicmass());
        assertEquals(14, element.getGroupnumber());
        assertEquals(3, element.getPeriodnumber());
        assertEquals("Metalloid", element.getFamilyname());
        assertEquals("Si-base.png", element.getImagename());
    }

}
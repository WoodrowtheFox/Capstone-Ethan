package com.example.capstone;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/**
 * This is the unit test for the element Iron
 */
class IronTest {
    @Test
    public void testIron(){
        Iron element = new Iron();

        assertEquals("Iron", element.getElementname());
        assertEquals(26, element.getAtomicnumber());
        assertEquals(55.84f, element.getAtomicmass());
        assertEquals(8, element.getGroupnumber());
        assertEquals(4, element.getPeriodnumber());
        assertEquals("Transition Metal", element.getFamilyname());
        assertEquals("Fe-base.png", element.getImagename());
    }

}
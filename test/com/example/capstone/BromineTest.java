package com.example.capstone;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/**
 * This is the unit test for the element Bromine
 */
class BromineTest {
    @Test
    public void testBromine(){
        Bromine element = new Bromine();

        assertEquals("Bromine", element.getElementname());
        assertEquals(35, element.getAtomicnumber());
        assertEquals(79.90f, element.getAtomicmass());
        assertEquals(17, element.getGroupnumber());
        assertEquals(4, element.getPeriodnumber());
        assertEquals("Halogen", element.getFamilyname());
        assertEquals("Br-base.png", element.getImagename());
    }

}
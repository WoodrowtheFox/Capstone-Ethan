package com.example.capstone;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/**
 * This is the unit test for the element Astatine
 */
class AstatineTest {
    @Test
    public void testAstatine(){
        Astatine element = new Astatine();

        assertEquals("Astatine", element.getElementname());
        assertEquals(85, element.getAtomicnumber());
        assertEquals(209.98715f, element.getAtomicmass());
        assertEquals(17, element.getGroupnumber());
        assertEquals(6, element.getPeriodnumber());
        assertEquals("Halogen", element.getFamilyname());
        assertEquals("At-base.png", element.getImagename());
    }

}
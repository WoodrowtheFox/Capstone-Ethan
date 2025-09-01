package com.example.capstone;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/**
 * This is the unit test for the element Selenium
 */
class SeleniumTest {
    @Test
    public void testSelenium(){
        Selenium element = new Selenium();

        assertEquals("Selenium", element.getElementname());
        assertEquals(34, element.getAtomicnumber());
        assertEquals(78.97f, element.getAtomicmass());
        assertEquals(16, element.getGroupnumber());
        assertEquals(4, element.getPeriodnumber());
        assertEquals("Nonmetal", element.getFamilyname());
        assertEquals("Se-base.png", element.getImagename());
    }

}
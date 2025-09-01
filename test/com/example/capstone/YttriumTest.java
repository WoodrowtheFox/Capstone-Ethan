package com.example.capstone;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/**
 * This is the unit test for the element Yttrium
 */
class YttriumTest {
    @Test
    public void testYttrium(){
        Yttrium element = new Yttrium();

        assertEquals("Yttrium", element.getElementname());
        assertEquals(39, element.getAtomicnumber());
        assertEquals(88.90584f, element.getAtomicmass());
        assertEquals(3, element.getGroupnumber());
        assertEquals(5, element.getPeriodnumber());
        assertEquals("Transition Metal", element.getFamilyname());
        assertEquals("Y-base.png", element.getImagename());
    }

}
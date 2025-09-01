package com.example.capstone;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/**
 * This is the unit test for the element Manganese
 */
class ManganeseTest {
    @Test
    public void testManganese(){
        Manganese element = new Manganese();

        assertEquals("Manganese", element.getElementname());
        assertEquals(25, element.getAtomicnumber());
        assertEquals(54.93804f, element.getAtomicmass());
        assertEquals(7, element.getGroupnumber());
        assertEquals(4, element.getPeriodnumber());
        assertEquals("Transition Metal", element.getFamilyname());
        assertEquals("Mn-base.png", element.getImagename());
    }

}
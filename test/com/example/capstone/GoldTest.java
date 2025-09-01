package com.example.capstone;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/**
 * This is the unit test for the element Gold
 */
class GoldTest {
    @Test
    public void testGold(){
        Gold element = new Gold();

        assertEquals("Gold", element.getElementname());
        assertEquals(79, element.getAtomicnumber());
        assertEquals(196.96657f, element.getAtomicmass());
        assertEquals(11, element.getGroupnumber());
        assertEquals(6, element.getPeriodnumber());
        assertEquals("Transition Metal", element.getFamilyname());
        assertEquals("Au-base.png", element.getImagename());
    }

}
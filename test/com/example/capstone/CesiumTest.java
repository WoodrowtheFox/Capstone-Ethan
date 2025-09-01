package com.example.capstone;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/**
 * This is the unit test for the element Cesium
 */
class CesiumTest {
    @Test
    public void testCesium(){
        Cesium element = new Cesium();

        assertEquals("Cesium", element.getElementname());
        assertEquals(55, element.getAtomicnumber());
        assertEquals(132.9054520f, element.getAtomicmass());
        assertEquals(1, element.getGroupnumber());
        assertEquals(6, element.getPeriodnumber());
        assertEquals("Alkali Metal", element.getFamilyname());
        assertEquals("Cs-base.png", element.getImagename());
    }

}
package com.example.capstone;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/**
 * This is the test for the element factory
 */
class ElementFactoryTest {
    @Test
    public void testelement(){
        ElementFactory myfactory = new ElementFactory();
        assertEquals(null, myfactory.factory(0));
    }
}
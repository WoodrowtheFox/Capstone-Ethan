package com.example.capstone;

import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

/**
 * This is the class for testing the feedback writer
 */
class FeedbackWriterTest {
    @Test
    public void testfeedback(){
        String a = "";
        FeedbackWriter writer = new FeedbackWriter();
        try(BufferedReader reader = new BufferedReader(new FileReader("Ethan Lundgren"))){
            a = reader.readLine();
        }
        catch(FileNotFoundException b){System.out.println(b);}
        catch(IOException o){System.out.println(o);}
        assertEquals("test", a);
    }
}
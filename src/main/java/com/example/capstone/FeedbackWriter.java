package com.example.capstone;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * This is the class for writing feedback onto tickets
 */
public class FeedbackWriter {
    /**
     * This is the function that creates the ticket
     * @param name - name of the ticket
     * @param feedback - feedback for the ticket
     */
    public void writefeedback(String name, String feedback){
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(name))){
            writer.write(feedback);
        }
        catch(IOException e){System.out.println(e);}
    }
}

package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HelloServiceTest {

    // Test the getGreetingMessage() method
    @Test
    public void testGetGreetingMessage() {
        HelloService helloService = new HelloService();
        String expected = "Hello, Welcome to the Java Service!";
        String actual = helloService.getGreetingMessage();
        
        // Check if the actual output matches the expected output
        assertEquals(expected, actual, "Greeting message should match");
    }
}


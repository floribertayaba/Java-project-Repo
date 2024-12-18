package com.example;

public class Application {

    public static void main(String[] args) {
        // Print a welcome message to the console
        System.out.println("Welcome to the Java Application!");

        // Create an instance of HelloService
        HelloService helloService = new HelloService();
        
        // Call the method to print the greeting message
        String greeting = helloService.getGreetingMessage();
        System.out.println(greeting);
    }
}


# Java Application Project

This project contains a simple Java application that demonstrates how to create a service (`HelloService`) and how to write unit tests using JUnit.

## Project Structure

- `Application.java`: The main class that runs the application.
- `HelloService.java`: A service that provides a greeting message.
- `HelloServiceTest.java`: A unit test for the `HelloService` class.
- `README.md`: This documentation.
- `pom.xml`: Maven configuration file for managing dependencies.

## Setup and Running the Project

1. Clone the repository to your local machine.
2. Make sure you have **Java** and **Maven** installed.
3. Navigate to the project directory and run:

   ```bash
   mvn clean install
   mvn exec:java


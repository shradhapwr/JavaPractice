package org.example;

import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class JavaLoggerExample {

    // Create a logger instance with a given name
    private static final Logger logger = Logger.getLogger(JavaLoggerExample.class.getName());

    public static void main(String[] args) {
        // Create a console handler
        ConsoleHandler consoleHandler = new ConsoleHandler();

        // Create a SimpleFormatter for the console handler
        SimpleFormatter formatter = new SimpleFormatter();
        consoleHandler.setFormatter(formatter);

        // Add the console handler to the logger
        logger.addHandler(consoleHandler);

        // Set the logger level to control the messages to be displayed
        logger.setLevel(Level.WARNING);

        // Log messages at different levels
        logger.severe("This is a severe message.");
        logger.warning("This is a warning message.");
        logger.info("This is an info message.");
        logger.config("This is a config message.");
        logger.fine("This is a fine message.");
        logger.finer("This is a finer message.");
        logger.finest("This is the finest message.");

        // Log an exception
        try {
            int result = 10 / 0; // Division by zero to generate an exception
        } catch (ArithmeticException e) {
            logger.log(Level.SEVERE, "An exception occurred", e);
        }
    }
}

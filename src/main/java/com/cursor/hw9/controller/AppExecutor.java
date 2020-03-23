package main.java.com.cursor.hw9.controller;

import main.java.com.cursor.hw9.task1.CaughtExceptions;
import main.java.com.cursor.hw9.task2.SafeDivision;

public class AppExecutor {

    public static void runProgram() {
        new CaughtExceptions().printAllExceptions();
        System.out.println("\n Task 2");
        new SafeDivision().runProgram();
    }
}

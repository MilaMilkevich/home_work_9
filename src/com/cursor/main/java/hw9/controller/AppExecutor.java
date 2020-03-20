package com.cursor.main.java.hw9.controller;

import com.cursor.main.java.hw9.task1.CaughtExceptions;
import com.cursor.main.java.hw9.task2.SafeDivision;

public class AppExecutor {

    public static void runProgram() {
        new CaughtExceptions().printAllExceptions();
        System.out.println("\n Task 2");
        new SafeDivision().runProgram();
    }
}

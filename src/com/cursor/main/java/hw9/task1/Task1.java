package com.cursor.main.java.hw9.task1;

import java.io.IOException;

public class Task1 {
    public void printAllExceptions() {
        showExceptionA();
        showExceptionB();
        showNullPointerException();
        showIOException();
    }

    private void showExceptionA() {
        try {
            throw new ExceptionA();
        } catch (ExceptionA exceptionA) {
            exceptionA.printStackTrace();
        }
    }

    private void showExceptionB() {
        try {
            throw new ExceptionB();
        } catch (ExceptionB exceptionB) {
            exceptionB.printStackTrace();
        }
    }

    private void showNullPointerException() {
        try {
            throw new NullPointerException();
        } catch (NullPointerException exception) {
            exception.printStackTrace();
        }
    }

    private void showIOException() {
        try {
            throw new IOException();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}



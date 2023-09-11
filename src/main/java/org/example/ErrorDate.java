package org.example;

public class ErrorDate extends Exception {
    public ErrorDate() {
    }
    public void dataException(String a) {
        System.out.println();
        System.out.printf("Error date format: %s", a);
        System.out.println();
    }
}
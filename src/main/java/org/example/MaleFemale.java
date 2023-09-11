package org.example;

public class MaleFemale extends Exception {
    public MaleFemale() {
    }

    public void maleFemaleException(String a) {
        System.out.println();
        System.out.printf("Error: %s", a);
        System.out.println();
    }
}
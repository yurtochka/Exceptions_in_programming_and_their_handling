package org.example;

public class ErrorData extends Exception{
    public ErrorData(){
    }
    public void dataException(String a) {
        System.out.println();
        System.out.printf("Error data format: %s", a);
        System.out.println();

    }
}

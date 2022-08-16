package org.lesson4;

public class ExceptionArgumentTriangle extends Exception {
    String error;

    public ExceptionArgumentTriangle(String error) {
        this.error = error;

    }
}

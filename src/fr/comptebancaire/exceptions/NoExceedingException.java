package fr.comptebancaire.exceptions;

public class NoExceedingException extends Exception {

    public NoExceedingException() {
        super();
    }

    public NoExceedingException(String message) {
        super(message);
    }
}

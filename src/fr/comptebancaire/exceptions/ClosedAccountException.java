package fr.comptebancaire.exceptions;

public class ClosedAccountException extends Exception {

    public ClosedAccountException(String message) {
        super(message);
    }
}

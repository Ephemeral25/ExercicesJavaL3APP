package fr.comptebancaire.exceptions;

public class MinimumWithdrawException extends Exception {

    public MinimumWithdrawException() {
        super();
    }

    public MinimumWithdrawException(String message) {
        super(message);
    }
}

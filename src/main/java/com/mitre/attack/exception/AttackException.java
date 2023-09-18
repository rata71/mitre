package com.mitre.attack.exception;


public class AttackException extends Exception {

    public AttackException(String message, Throwable exception) {
        super(message, exception);
    }

    public AttackException(String message) {
        super(message);
    }

}

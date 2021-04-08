package com.userregistration;

public class UserInvalidRegistrationDetailsException extends Exception {

    public enum ExceptionType {
            ENTERED_NULL,
            ENTERED_EMPTY,
            ENTERED_DIGITS,
            ENTERED_LETTERS,
    }

    public ExceptionType type;

    public UserInvalidRegistrationDetailsException(ExceptionType type, String message) {
        super(message);
        this.type = type;
    }


}

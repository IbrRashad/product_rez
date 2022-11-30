package com.company.sintra.exception;


import static com.company.sintra.exception.ErrorCodes.USER_NOT_FOUND;

public class UserNotFoundException extends GenericException {
    public UserNotFoundException(Object... arguments) {
        super(USER_NOT_FOUND.code, USER_NOT_FOUND.code, 404, arguments);
    }
}

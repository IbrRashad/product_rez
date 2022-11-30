package com.company.sintra.exception;

import static com.company.sintra.exception.ErrorCodes.LENGTH_NOT_VALID;

public class     LengthNotValidException extends GenericException {

    public LengthNotValidException(Object... argument) {
        super(LENGTH_NOT_VALID.code, LENGTH_NOT_VALID.code, 404, argument);
    }
}

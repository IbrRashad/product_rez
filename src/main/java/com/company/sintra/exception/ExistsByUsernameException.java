package com.company.sintra.exception;

import static com.company.sintra.exception.ErrorCodes.EXIST_USER_NAME;

public class ExistsByUsernameException extends GenericException {
    public ExistsByUsernameException( Object... argument) {
        super(EXIST_USER_NAME.code, EXIST_USER_NAME.code, 409, argument);
    }
}

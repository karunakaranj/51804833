package com.oxbank.app.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code=HttpStatus.CONFLICT,reason="user already exists")
public class CustomerAlreadyExistsException extends Exception {

}

package http.exception;

import lombok.Getter;

import java.util.List;
import http.validator.Error;

public class ValidationException extends RuntimeException {

    @Getter
    private final List<Error> errors;

    public ValidationException(List<Error> errors) {
        this.errors = errors;
    }
}
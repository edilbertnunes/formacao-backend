package models.exceptions;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.experimental.SuperBuilder;

import java.util.List;

@SuperBuilder
public class ValidationException extends StandardError {

    @Getter
    private List<fieldError> errors;

    @Getter
    @AllArgsConstructor
    private static class fieldError {
        private String field;
        private String message;
    }

    public void addError(final  String fieldName, String message) {
        this.errors.add(new fieldError(fieldName, message));
    }
}


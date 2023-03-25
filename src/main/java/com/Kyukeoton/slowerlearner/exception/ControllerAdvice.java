package com.Kyukeoton.slowerlearner.exception;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ControllerAdvice {

    @ExceptionHandler
    public ResponseEntity<String> handleException(BusinessException businessException) {
        return ResponseEntity.badRequest()
                .body(businessException.getMessage());
    }
}

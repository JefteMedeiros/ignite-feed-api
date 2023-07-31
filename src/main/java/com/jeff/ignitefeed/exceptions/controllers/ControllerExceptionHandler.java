package com.jeff.ignitefeed.exceptions.controllers;

import com.jeff.ignitefeed.exceptions.ObjectNotFoundException;
import com.jeff.ignitefeed.exceptions.StandardError;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.LocalDateTime;


// Exceção de controller
@ControllerAdvice
public class ControllerExceptionHandler {
    @ExceptionHandler(ObjectNotFoundException.class)
    public ResponseEntity<StandardError> objectNotFound (ObjectNotFoundException e, HttpServletRequest req) {
        String error = "Objeto não encontrado";
        HttpStatus status = HttpStatus.NOT_FOUND;

        StandardError standardError = StandardError.builder()
                .timeStamp(LocalDateTime.now())
                .status(status.value())
                .error(error)
                .message(e.getMessage())
                .path(req.getRequestURI())
                .build();

        return ResponseEntity.status(status).body(standardError);
    }
}

package com.erikviana.todosimple.services.exceptions;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import lombok.extern.slf4j.Slf4j;

@Slf4j(topic = "GLOBAL_EXCEPTION_HANDLER")
@RestControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler{
    
    @Value("${server.error.include-exception}")
    private boolean printStackTrace;

}

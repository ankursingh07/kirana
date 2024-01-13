package com.assignment.kirana.web.exceptionhandler;

import com.assignment.kirana.dto.ErrorResponseDTO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@Slf4j
@RequiredArgsConstructor
@RestControllerAdvice
public class GlobalExceptionHandler {

    private static final String GENERIC_ERROR = "GENERIC ERROR";

    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public ErrorResponseDTO handleGenericException(Exception exception) {
        log.error("Unexpected exception occurs {}",exception);
        return ErrorResponseDTO.builder()
                .errorCode(GENERIC_ERROR)
                .errorMessage(exception.getMessage())
                .build();
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ErrorResponseDTO handleMethodArgumentNotValidException(Exception exception) {
        log.error("Handling MethodArgumentNotValidException {}",exception);
        return ErrorResponseDTO.builder()
                .errorCode("HTTP_ERROR")
                .errorMessage(exception.getMessage())
                .build();
    }

    @ExceptionHandler(RuntimeException.class)
    @ResponseStatus(HttpStatus.BAD_GATEWAY)
    public ErrorResponseDTO handleRuntimeException(RuntimeException exception) {
        log.error("Handling Runtime Exception {}",exception);
        return ErrorResponseDTO.builder()
                .errorCode("HTTP_ERROR")
                .errorMessage(exception.getMessage())
                .build();
    }
}

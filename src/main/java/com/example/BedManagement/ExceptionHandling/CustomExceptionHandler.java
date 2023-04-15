package com.example.BedManagement.ExceptionHandling;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.Date;
@ControllerAdvice
public class CustomExceptionHandler {
    @ExceptionHandler(CoustomException.class)
    public ResponseEntity<ExceptionBean> getException(Exception ex) {
        ExceptionBean exceptionBean = new ExceptionBean();
        exceptionBean.setMsg(ex.getMessage());
        exceptionBean.setDate(new Date());
        return new ResponseEntity<>(exceptionBean, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}

package com.marvel.marvelapi.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;

@ControllerAdvice
public class GlobalExceptionHandler {

	@ResponseStatus(code = HttpStatus.BAD_REQUEST, reason = "Parâmetro inválido") // 400
	@ExceptionHandler(value = {MethodArgumentTypeMismatchException.class})
	public void handlerBadRequest(){
		
	}
	
	@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "Registro não encontrado") // 404
    @ExceptionHandler(value = {RegistroNaoEncontradoException.class})
    public void handleNotFound() {
        
    }
	
    @ResponseStatus(code = HttpStatus.INTERNAL_SERVER_ERROR, reason = "Ops! Há algo de errado") // 500
    @ExceptionHandler(Exception.class)
    public void handleGeneralError(Exception ex) {
        
    }
    
}

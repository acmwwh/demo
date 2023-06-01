package org.example.acmwwh.core.exception;

import lombok.NonNull;
import lombok.extern.slf4j.Slf4j;
import org.example.acmwwh.core.param.ResponseResult;
import org.springframework.context.support.DefaultMessageSourceResolvable;
import org.springframework.http.HttpStatus;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.validation.ConstraintViolationException;
import javax.xml.bind.ValidationException;
import java.net.BindException;

/**
 * @description Global exception handler.
 * @author linfan
 * @date 2023/06/01
 */
@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler {

    /**
     * exception handler for bad request exception
     *
     * @param e exception
     * @return ResponseResult
     */
    @ResponseBody
    @ResponseStatus(code = HttpStatus.BAD_REQUEST)
    @ExceptionHandler(
            value = {
                BindException.class,
                ValidationException.class,
                MethodArgumentNotValidException.class
            })
    public ResponseResult<Object> handleParameterVerificationException(@NonNull Exception e) {

        StringBuilder stringBuilder = new StringBuilder();
        log.warn("Exception: {}", e.getMessage());
        if (e instanceof BindException) {
            BindingResult bindingResult = ((MethodArgumentNotValidException) e).getBindingResult();
            bindingResult.getAllErrors().stream().map(DefaultMessageSourceResolvable::getDefaultMessage)
                    .forEach(stringBuilder::append);
        } else if(e instanceof ConstraintViolationException){
            if (null != e.getMessage()) {
                stringBuilder.append(e.getMessage());
            }
        } else {
            stringBuilder.append("invalid parameter");
        }
        return ResponseResult.fail(stringBuilder.toString(), "invalid parameter");
    }

    /**
     * handle business exception.
     *
     * @param businessException business exception
     * @return ResponseResult
     */
    @ResponseBody
    @ExceptionHandler(BusinessException.class)
    public ResponseResult<Object> handleBusinessException(BusinessException businessException) {

        log.error(businessException.getMessage(), businessException);
        businessException.printStackTrace();
        return ResponseResult.fail(businessException, businessException.getMessage());
    }

    /**
     * handler other exception
     *
     * @param e exception
     * @return ResponseResult
     */
    @ResponseBody
    @ExceptionHandler(Exception.class)
    public ResponseResult<Object> handleException(Exception e) {

        log.error(e.getMessage(), e);
        e.printStackTrace();
        return ResponseResult.fail(e, e.getMessage());
    }
}

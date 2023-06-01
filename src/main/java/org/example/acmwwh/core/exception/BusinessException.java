package org.example.acmwwh.core.exception;

/**
 * @description Business Exception
 * @author linfan
 * @date 2023/06/01
 */
public class BusinessException extends RuntimeException {

    public BusinessException() {}

    public BusinessException(String msg) {
        super(msg);
    }

    public BusinessException(Throwable cause) {
        super(cause);
    }
}

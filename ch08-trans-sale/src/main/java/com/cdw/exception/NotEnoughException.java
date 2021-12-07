package com.cdw.exception;

/**
 * @author: cdw
 * @date: 2021/11/24 19:12
 * @description:
 */
public class NotEnoughException extends RuntimeException{
    public NotEnoughException() {
        super();
    }

    public NotEnoughException(String message) {
        super(message);
    }
}

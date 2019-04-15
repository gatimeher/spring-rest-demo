package com.example.demo.exception;

public class BusinessException extends Exception {

    private String exceptionValue;
    private String exceptionMessage;

    public BusinessException(String exceptionValue, String exceptionMessage) {
        this.exceptionValue = exceptionValue;
        this.exceptionMessage = exceptionMessage;
    }

    public String getExceptionValue() {
        return exceptionValue;
    }

    public void setExceptionValue(String exceptionValue) {
        this.exceptionValue = exceptionValue;
    }

    public String getExceptionMessage() {
        return exceptionMessage;
    }

    public void setExceptionMessage(String exceptionMessage) {
        this.exceptionMessage = exceptionMessage;
    }
}

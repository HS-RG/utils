package com.hsrg.exception;

public class MyException extends Exception {
    private String msg;
    private Integer code;

    public MyException(String msg, Integer code) {
        this.msg=msg;
        this.code=code;
    }
}

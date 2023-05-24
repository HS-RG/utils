package com.hsrg.exception;

import lombok.Data;

@Data
public class MyException extends Exception {
    private String msg;

    public MyException(String msg) {
        this.msg=msg;
    }
}

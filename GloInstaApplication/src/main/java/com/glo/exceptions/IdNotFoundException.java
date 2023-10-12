package com.glo.exceptions;

public class IdNotFoundException extends RuntimeException {

    String msg;

    public IdNotFoundException(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }
}

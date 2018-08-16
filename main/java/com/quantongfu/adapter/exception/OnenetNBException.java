package com.quantongfu.adapter.exception;

/**
 * Created by zhaofang on 2018/8/14.
 */
public class OnenetNBException extends RuntimeException{

    private NBStatus status;
    private String message = null;
    public OnenetNBException(NBStatus status) {
        this.status = status;
    }
    public OnenetNBException(NBStatus status, String message) {
        this.status = status;
        this.message = message;
    }
    public int getErrorNo() {
        return status.getErrorNo();
    }

    public String getError() {
        if (message != null) {
            return status.getError() + ": " + message;
        } else {
            return status.getError();
        }
    }


}

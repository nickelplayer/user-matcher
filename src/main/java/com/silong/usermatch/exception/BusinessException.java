package com.silong.usermatch.exception;

import com.silong.usermatch.common.ErrorCode;

/**
 * 自定义异常类
 */
public class BusinessException extends RuntimeException {

    private final int code;

    private final String description;

    public BusinessException(String message, int code, String description) {
        super(message);
        this.code = code;
        this.description = description;
    }

    public BusinessException(ErrorCode errorCode) {
        super(errorCode.getMessage());
        this.code = errorCode.getCode();
        this.description = errorCode.getDescription();
    }


    public String getDescription() {
        return description;
    }

    public int getCode() {
        return code;
    }
}

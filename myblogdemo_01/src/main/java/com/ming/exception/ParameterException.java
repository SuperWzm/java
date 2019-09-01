package com.ming.exception;

import jdk.nashorn.internal.objects.annotations.Getter;
import jdk.nashorn.internal.objects.annotations.Setter;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wang
 * Date: 2019-08-29
 * Time: 10:21
 **/
@lombok.Getter
@lombok.Setter
public class ParameterException extends RuntimeException {

    private String code;


    public ParameterException(String message) {

        super("客户端错误：" + message);
        code = "400";
    }

    public ParameterException(String message, Throwable cause) {
        super("客户端错误：" + message, cause);
        code = "400";
    }

}
    
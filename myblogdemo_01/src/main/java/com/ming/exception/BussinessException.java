package com.ming.exception;

import lombok.Getter;
import lombok.Setter;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wang
 * Date: 2019-08-29
 * Time: 15:07
 **/
@Getter
@Setter
public class BussinessException extends RuntimeException {
    private String code;



    public BussinessException(String message) {
        super("业务异常："+message);
        code = "401";
    }

    public BussinessException(Throwable cause) {
        super("业务异常："+ cause);
        code = "401";
    }

}
    
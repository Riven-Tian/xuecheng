package com.xuecheng.base.exception;

import java.io.Serializable;

/**
 * @Author：tian
 * @Description:  和前端约定的异常处理
 * @Date：2023/10/14 17:15
 */
public class RestErrorResponse implements Serializable {

    private String errMessage;

    public RestErrorResponse(String errMessage){
        this.errMessage= errMessage;
    }

    public String getErrMessage() {
        return errMessage;
    }

    public void setErrMessage(String errMessage) {
        this.errMessage = errMessage;
    }
}

package com.chenxy.common.exception;

/**
 * 公共异常枚举
 * @author chenxy
 */
public enum BusinessExceptionEnum implements CommonException{
    //错误码不同的开头串可表示不同的服务模块的错误,通用参数请求错误为1开头
    UNKNOWN_ERROR(100000,"未知错误"),
    PARAMETER_VALIDATION_ERROR(100001,"参数不合法"),

    //用户中心模块为1开头
    USER_NOT_EXIST(200001,"用户不存在")

    ;

    private BusinessExceptionEnum(int errCode, String errMsg) {
        this.errCode = errCode;
        this.errMsg = errMsg;
    }

    private int errCode;
    private String errMsg;

    public int getErrCode() {
        return this.errCode;
    }

    public String getErrMsg() {
        return this.errMsg;
    }

    public CommonException setErrMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;
    }
}

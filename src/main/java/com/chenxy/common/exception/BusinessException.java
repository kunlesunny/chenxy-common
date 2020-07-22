package com.chenxy.common.exception;

/**
 * 公共异常类
 * @author chenxy
 */
public class BusinessException extends Exception implements CommonException{
    private CommonException commonException;

    /**
     * 接受EmBusinessError传参构造业务异常
     * @param commonException
     */
    public BusinessException(CommonException commonException){
        super();
        this.commonException = commonException;
    }

    /**
     * 接受EmBusinessError传参构造业务异常,可自定义错误信息
     * @param commonError
     * @param errMsg
     */
    public BusinessException(CommonException commonError, String errMsg){
        super();
        this.commonException = commonError;
        this.commonException.setErrMsg(errMsg);
    }

    public int getErrCode() {
        return this.commonException.getErrCode();
    }

    public String getErrMsg() {
        return this.commonException.getErrMsg();
    }

    public CommonException setErrMsg(String errMsg) {
        this.commonException.setErrMsg(errMsg);
        return this;
    }
}

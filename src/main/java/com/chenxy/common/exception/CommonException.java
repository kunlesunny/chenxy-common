package com.chenxy.common.exception;

/**
 * 公共异常接口
 * @author chenxy
 */
public interface CommonException {
    int getErrCode();
    String getErrMsg();
    CommonException setErrMsg(String errMsg);
}

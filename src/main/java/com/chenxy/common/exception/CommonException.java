package com.chenxy.common.exception;

public interface CommonException {
    int getErrCode();
    String getErrMsg();
    CommonException setErrMsg(String errMsg);
}

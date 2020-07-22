package com.chenxy.common.controller;

import com.chenxy.common.exception.BusinessException;
import com.chenxy.common.exception.BusinessExceptionEnum;
import com.chenxy.common.result.CommonResult;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * Controller公共基类
 * @author chenxy
 */
public class BaseController {

    /**
     * 统一异常拦截，针对springboot
     * @param request
     * @param exception
     * @return
     */
    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public CommonResult handlerException(HttpServletRequest request, Exception exception){
        Map map = new HashMap();
        if(exception instanceof BusinessException){
            BusinessException businessException = (BusinessException) exception;
            map.put("errCode",businessException.getErrCode());
            map.put("errMsg",businessException.getErrMsg());
        }else {
            map.put("errCode", BusinessExceptionEnum.UNKNOWN_ERROR.getErrCode());
            map.put("errMsg",BusinessExceptionEnum.UNKNOWN_ERROR.getErrMsg());
        }
        return CommonResult.create("fail", map);
    }

}

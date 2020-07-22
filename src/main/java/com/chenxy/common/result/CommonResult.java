package com.chenxy.common.result;

/**
 * 公共返回类
 * @author chenxy
 */
public class CommonResult {
    /**
     * 代表返回结果的状态 success 和 fail
     */
    private String status;

    /**
     * 如果status为success ，则data为前端需要的json数据
     * 如果status为fail，则data为通用的错误码格式
     */
    private Object data;

    public CommonResult(){

    }

    public CommonResult(String status, Object data) {
        this.status = status;
        this.data = data;
    }

    public static CommonResult create(Object data){
        return create("success",data);
    }

    public static CommonResult create(String status,Object data){
        CommonResult commonReturnType = new CommonResult(status,data);
        return commonReturnType;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}

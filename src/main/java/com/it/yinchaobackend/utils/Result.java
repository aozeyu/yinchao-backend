package com.it.yinchaobackend.utils;

/**
 * @program: yinchao-backend
 * @description: 222
 * @packagename: com.it.yinchaobackend.utils
 * @author: 姚泽宇
 * @date: 2022-08-28 21:12
 **/
public class Result<T> {
    private Integer code;
    private String msg;
    private T data;
    public Result() {
    }

    public Result(Integer code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }
    public Integer getCode() {
        return code;
    }

    public Result setCode(Integer code) {
        this.code = code;
        return this;
    }

    public String getMsg() {
        return msg;
    }

    public Result setMsg(String msg) {
        this.msg = msg;
        return this;
    }

    public T getData() {
        return data;
    }

    public Result setData(T data) {
        this.data = data;
        return this;
    }

    @Override
    public String toString() {
        return "Result{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }

    public Result setCode(ResultEnum resultEnum) {
        this.code = resultEnum.code;
        return this;
    }
}

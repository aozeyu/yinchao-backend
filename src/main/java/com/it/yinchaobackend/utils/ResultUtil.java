package com.it.yinchaobackend.utils;

/**
 * @program: yinchao-backend
 * @description: 返回结果类
 * @packagename: com.it.yinchaobackend.utils
 * @author: 姚泽宇
 * @date: 2022-08-28 21:16
 **/
public class ResultUtil {
    public static <T> Result<T>  defineSuccess(Integer code, T data) {
        Result result = new Result<>();
        return result.setCode(code).setData(data);
    }

    public static <T> Result<T> success(T data) {
        Result result = new Result();
        result.setCode(ResultEnum.SUCCESS).setData(data);
        return result;
    }

    public static <T> Result<T> fail(String msg) {
        Result result = new Result();
        result.setCode(ResultEnum.FAIL).setMsg(msg);
        return result;
    }

    public static <T> Result<T> defineFail(int code, String msg){
        Result result = new Result();
        result.setCode(code).setMsg(msg);
        return result;
    }

    public static <T> Result<T> define(int code, String msg, T data){
        Result result = new Result();
        result.setCode(code).setMsg(msg).setData(data);
        return result;
    }
}

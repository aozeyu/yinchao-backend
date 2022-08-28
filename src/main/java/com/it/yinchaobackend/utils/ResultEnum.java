package com.it.yinchaobackend.utils;

/**
 * @program: yinchao-backend
 * @description: 222
 * @packagename: com.it.yinchaobackend.utils
 * @author: 姚泽宇
 * @date: 2022-08-28 21:15
 **/
public enum ResultEnum {
    /**
     * 成功
     */
    SUCCESS(200),
    /**
     * 失败
     */
    FAIL(400),
    /**
     * 接口不存在
     */
    NOT_FOUND(404),
    /**
     * 服务器内部错误
     */
    INTERNAL_SERVER_ERROR(500);
    public int code;
    ResultEnum(int code) {
        this.code = code;
    }
}

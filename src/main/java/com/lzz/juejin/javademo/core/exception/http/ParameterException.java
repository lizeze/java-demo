package com.lzz.juejin.javademo.core.exception.http;

/**
 * @author lzz
 * @create 2021-05-12 11:21
 */
public class ParameterException   extends HttpException{
    public ParameterException(Integer code) {
        this.code = code;
        this.httpStatusCode = 400;
    }
}

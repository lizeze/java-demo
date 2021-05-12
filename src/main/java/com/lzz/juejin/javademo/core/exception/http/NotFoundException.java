package com.lzz.juejin.javademo.core.exception.http;

/**
 * @author lzz
 * @create 2021-05-12 11:21
 */
public class NotFoundException extends HttpException {

    public NotFoundException(Integer code) {
        this.httpStatusCode = 404;
        this.code = code;
    }
}

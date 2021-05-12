package com.lzz.juejin.javademo.core.exception;

import com.lzz.juejin.javademo.core.exception.http.ParameterException;
import com.lzz.juejin.javademo.vo.ResponseVO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * @author lzz
 * @create 2021-05-12 11:25
 */
@ControllerAdvice
public class GlobalExceptionAdvice {

    @ExceptionHandler(ParameterException.class)
    public ResponseEntity handleParameterException(ParameterException e) {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(getError(e.getCode()));
    }

    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity handleRuntimeException(RuntimeException e) {
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(getError(500));
    }


    private ResponseVO getError(Integer code) {


        //todo 根据code获取对应的异常提示


        return new ResponseVO(500, "统一异常");


    }


}

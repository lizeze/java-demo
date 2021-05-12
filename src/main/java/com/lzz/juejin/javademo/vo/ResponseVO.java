package com.lzz.juejin.javademo.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author lzz
 * @create 2021-05-12 11:27
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseVO {


    private Integer code;
    private String mess;


}

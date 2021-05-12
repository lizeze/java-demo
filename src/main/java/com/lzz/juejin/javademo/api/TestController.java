package com.lzz.juejin.javademo.api;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lzz
 * @create 2021-05-12 11:25
 */
@RestController
@RequestMapping("/api")
public class TestController {


    @GetMapping("/error")
    public ResponseEntity errorMethod() {


        int a = 1 / 0;

        return ResponseEntity.status(HttpStatus.OK).body(true);
    }


}

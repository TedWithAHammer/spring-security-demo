package com.poseidon.security_demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * Created by leo on 2019/5/31.
 * Description:
 */
@RestControllerAdvice
@RequestMapping("/pos-match")
public class PositiveMatchController {
    @GetMapping("/1")
    public String test1() {
        return "1";
    }
}

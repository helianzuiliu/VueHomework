package com.hlzl.background.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ErrorController {
    @GetMapping("/error")
    public String getErrorMsg() {
        return "没有出错，你跑这干嘛";
    }
}

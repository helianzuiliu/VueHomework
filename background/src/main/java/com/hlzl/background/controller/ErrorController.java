package com.hlzl.background.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/error")
public class ErrorController {
    @GetMapping
    public String getErrorMsg() {
        return "没有出错，你跑这干嘛";
    }
}

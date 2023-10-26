package com.hlzl.background.controller;

import java.util.HashMap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("/testString")
    public String getTestString() {
        return "Test String";
        // TODO:
    }

    @PostMapping("/PostTest")
    public HashMap<String, Object> PostMsg(@RequestParam String Name, Integer Age) {
        HashMap<String, Object> map = new HashMap<>();
        map.put("Name", Name);
        map.put("Age", Age);
        return map;
    }

}

package com.hlzl.background.controller;

import java.util.HashMap;

import com.hlzl.background.dao.PeopleDao;
import com.hlzl.background.data.People;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Autowired
    PeopleDao peopleDao;

    @GetMapping("/testString")
    public HashMap<String,Object> getTestString() {
        HashMap<String, Object> hash = new HashMap<>();
        People p=new People("hlzl",21);

        hash.put("101", p);

        return hash;
    }

    @PostMapping("/PostTest")
    public String PostMsg(@RequestParam String Name, Integer Age) {
        peopleDao.insert(new People(Name,Age));

        return "map";
    }

}

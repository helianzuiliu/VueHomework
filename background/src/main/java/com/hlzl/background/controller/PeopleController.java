package com.hlzl.background.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hlzl.background.entity.People;
import com.hlzl.background.service.UserService;

@RestController
@RequestMapping("/people")
public class PeopleController {
  // @Autowired
  private UserService service;

  @GetMapping("")
  public List<People> getPeopleList() {
    List<People> list = service.list();
    return list;
  }
}

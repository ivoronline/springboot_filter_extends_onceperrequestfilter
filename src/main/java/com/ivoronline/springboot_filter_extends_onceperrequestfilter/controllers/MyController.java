package com.ivoronline.springboot_filter_extends_onceperrequestfilter.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {

  @ResponseBody
  @RequestMapping("/Hello")
  public String hello() {
    System.out.println("Controller: Code from Controller");
    return "Hello from Controller";
  }

}

package com.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
      public HelloController() {
    	  System.out.println("In a Hello controlelr");
      }
      @RequestMapping("/")
      public String Hello() {
    	 System.out.println("in hello");
    	  return "/index";
      }
}

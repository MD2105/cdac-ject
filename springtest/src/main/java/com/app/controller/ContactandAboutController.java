package com.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/other")
public class ContactandAboutController {
         public ContactandAboutController()
         {
        	 System.out.println("in contact and about");
         }
         
       @RequestMapping("/Contact")
       public String Contact() {
    	   return "/Other/ContactUs";
       }
       
       @RequestMapping("/About")
       public String About() {
    	   return "/Other/About";
       }
}

package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.app.dao.IStudentDao;
import com.app.pojos.Students;
import com.app.pojos.Trainer;

@Controller
@RequestMapping("/admin")
public class AdminController {
     public AdminController() {
    	 System.out.println("In Admin Controller");
     }
     @RequestMapping("/adminview")
     public String adminview() {
    	 return "/admin";
     }
     @Autowired
     private IStudentDao dao;
     @RequestMapping("/trainer-reg")
     public String Register_User(Model muser)
     {
     	System.out.println("IN Registration Page");
     	Trainer newUser = new Trainer();
     	muser.addAttribute("New_User", newUser);
     	return "/TrainerRegistration/register";
     }
     @GetMapping("/add")
     public String add_user(@ModelAttribute("New_User") Trainer newUser,Model map) {
     	System.out.println("In adding user");
     	System.out.println(dao.add_User(newUser));
     	map.addAttribute("msgt","You Have Signed up Successfully");
     	return "redirect:/user/login";
     }
   
     @RequestMapping("/studreg")
     public String Register_student(Model muser)
     {
     	System.out.println("IN Registration Page");
     	Trainer newUser = new Trainer();
     	muser.addAttribute("New_User", newUser);
     	return "/StudentRegistration/student-reg";
     }
     @GetMapping("/stuadd")
     public String add_student(@ModelAttribute("New_User") Students newUser,Model map) {
     	System.out.println("In adding user");
     	System.out.println(dao.add_Student(newUser));
     	map.addAttribute("msgs","You Have Signed up Successfully");
     	return "redirect:/studentfile/login";
     }
}

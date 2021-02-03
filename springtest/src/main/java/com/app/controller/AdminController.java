package com.app.controller;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.app.dao.IAdmin;
import com.app.dao.ICourse;
import com.app.dao.IStudentDao;
import com.app.pojos.Courses;
import com.app.pojos.Students;
import com.app.pojos.Trainer;

@Controller
@RequestMapping("/admin")
public class AdminController {
     public AdminController() {
    	 System.out.println("In Admin Controller");
     }
     @Autowired
  	private IAdmin admndao;
      @Autowired
      private IStudentDao dao;
      @Autowired
      private ICourse cou;
     @RequestMapping("/adminview")
     public String adminview() {
    	 return "/Admin/admin";
     }
     @RequestMapping("/adminlogin")
     public String adminlogin() {
    	 return "/Admin/adminlogin";
     }
    
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
     
     @RequestMapping("/course")
     public String course() {
    	 return "/Admin/course";
     }
     @RequestMapping("/course-add")
     public String registerCourse(Courses c,
    		 @RequestParam String courseId,@RequestParam Float cduration,@RequestParam String cname
    		 ,RedirectAttributes map
    		 )
     			
     {
     	System.out.println("IN  Course Registration Page");
     	c.setCourseId(courseId);
     	c.setCourseName(cname);
     	c.setCourseDuration(BigDecimal.valueOf(cduration));
     	admndao.addCourse(c);
     	map.addFlashAttribute("mesg", "Courses Added Successfully");
     	return "redirect:/";
     }
     
     @RequestMapping("/getcourse")
     public void getcourse(@RequestParam String faculty_id) {
    	System.out.println( cou.getCourses(faculty_id));
     }
}

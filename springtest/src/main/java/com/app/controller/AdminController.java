package com.app.controller;

import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;
import java.sql.SQLException;

import javax.mail.MessagingException;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


import com.app.dao.ICourse;

import com.app.pojos.Courses;
import com.app.pojos.Students;
import com.app.pojos.Trainer;
import com.app.service.IRegisterService;

@Controller
@RequestMapping("/admin")
public class AdminController {
     public AdminController() {
    	 System.out.println("In Admin Controller");
     }
     @Autowired
     private IRegisterService reg;
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
     	return "/TrainerRegistration/register";
     }
     @GetMapping("/add")
     public String add_user(@ModelAttribute Trainer newUser,Model map) throws UnsupportedEncodingException, MessagingException, SQLException {
     	System.out.println("In adding user");
     	if(reg.add_Trainer(newUser))
     	{
     		return "redirect:/user/login";
     	}
     	else
		{
     		map.addAttribute("msg","Already Exists !!");
			return "/Admin/admin";
		}
     	
     }
      
     @RequestMapping("/studreg")
     public String Register_student()
     {
     	System.out.println("IN Registration Page");
     	return "/StudentRegistration/student-reg";
     }
     @GetMapping("/stuadd")
     public String add_student(@ModelAttribute Students newUser,Model map) throws UnsupportedEncodingException, MessagingException{
     	  System.out.println("In adding user");
   
	if(reg.add_Student(newUser))
             { 
			   return "redirect:/studentfile/login";
            }
	else
			{
				map.addAttribute("msg","Already Exists !!");
				return "/Admin/admin";
			}
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
     	if( reg.add_Course(c))
     	{
     		map.addFlashAttribute("mesg", "Courses Added Successfully");
         	return "redirect:/";
     	}
     	else
		{
			return "admin/adminview";
		}	
     }
     
     @RequestMapping("/getcourse")
     public void getcourse(@RequestParam String faculty_id) {
    	System.out.println( cou.getCourses(faculty_id));
     }
}

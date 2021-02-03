package com.app.controller;

import java.io.IOException;
import java.sql.*;
import java.util.List;
import java.util.Optional;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.app.dao.ICourse;
import com.app.dao.IStudentDao;
import com.app.pojos.Courses;
import com.app.pojos.DataStudent;
import com.app.pojos.Trainer;
import com.app.pojos.assignments;
import com.app.repo.AssignmentRepository;
import com.app.repo.DocumentRepository;

@Controller
@RequestMapping("/user")
public class TrainerController {
    public TrainerController() {
    	System.out.println("In User Controller");
    }
    @Autowired
    private IStudentDao dao;
    @Autowired
    private ICourse cdao;
    @Autowired
    private AssignmentRepository arepo;
    @Autowired
	private DocumentRepository repo;
    @RequestMapping("/login")
    public String Form_Fill(Model map) {
    	System.out.println("In Form Fill ");
    	Trainer t = new Trainer();
    	map.addAttribute("auth", t);
		return "/TrainerLogin/login";
    }
    
    
    @PostMapping("/login")
    public String Auth_User(@ModelAttribute("auth") Trainer t,HttpSession hp,Model c,Model profile,Model map)
    {
    	Boolean value = false;
    	System.out.println("In post login ");
         String name = t.getFaculty_email();
         String pass = t.getFaculty_password();
    	value = dao.AuthenticateUser(name,pass);
    	Trainer p = dao.getProfileTrainer(name, pass);
    	
    	  List <Courses> coursefac= cdao.getCourses(String.valueOf(p.getFaculty_id()));
    	System.out.print(value);
    	
    	if(value) 
    	{
    		//List<assignments> listdoc = arepo.findAll(String.valueOf(p.getFaculty_id()));
    		//map.addAttribute("list",listdoc);
    		hp.setAttribute("course",coursefac);
    		hp.setAttribute("fac",p);
    		return "/TrainerLogin/profile";
    	}
    else
    	{
    	map.addAttribute("msg","Invalid Username/password...");
    	   return "/TrainerLogin/login";
        }
    }
    
   @PostMapping("/upload")
   public String AssignmentUpload(@RequestParam("assign_file") MultipartFile mfile,@RequestParam String faculty_id,@RequestParam String course_id,
		                           @RequestParam String assignment_issued_date,@RequestParam String end_date) throws IOException 
   
   
   {
	   
	 
	   System.out.println("In assignment upload");
	   String files = StringUtils.cleanPath(mfile.getOriginalFilename());
	   assignments asfile = new assignments();
	   asfile.setAssignment_description(mfile.getBytes());
	   asfile.setAssignment_end_date(Date.valueOf(end_date));
	   asfile.setAssignment_issued_date(Date.valueOf(assignment_issued_date));
	   asfile.setDoc_name(files);
	   asfile.setCourse_id(course_id);
	   asfile.setFaculty_id(faculty_id);
	   arepo.save(asfile);
	  
	   return "/TrainerLogin/profile";
   }
    
   @GetMapping("/download")
   public void downloadFile(@Param("id") Long id,HttpServletResponse response) throws Exception
   {
   	Optional<assignments> result = arepo.findById(id);
   	if(!result.isPresent()) {
   		throw new Exception("Could not fine");
   		
   	}
   	assignments docu = result.get();
   response.setContentType("application/octet-stream");
   String headerKey = "Content-Disposition";
   String headerValue = "attachment; filename="+docu.getDoc_name();
   response.setHeader(headerKey, headerValue);
   
   ServletOutputStream outstream = response.getOutputStream();
     outstream.write(docu.getAssignment_description());
     outstream.close();
     
   }
   
   @GetMapping("/showfiles")
	public String viewHomepage(@RequestParam String course_id,Model map) {
	  
		List<DataStudent> listdoc = repo.findAllc(course_id);
		map.addAttribute("list",listdoc);
		return "/TrainerLogin/Submittedfiles";
	}
    @GetMapping("/showfile")
    public String showpage(@RequestParam String faculty_id,HttpSession h) {
    	List <Courses> coursefac= cdao.getCourses(faculty_id);
    	h.setAttribute("c",coursefac);
    	return "/TrainerLogin/Submittedfiles";
    }
   @GetMapping("/grade")
   public String PuttingGrade(@RequestParam String grade,@RequestParam String student_prn,@RequestParam String course_id,Model map) {
	  dao.PuttingGrade(grade, student_prn,course_id);
	  List<DataStudent> listdoc = repo.findAllc(course_id);
		map.addAttribute("list",listdoc);
	   return "/TrainerLogin/Submittedfiles";
   }
 @GetMapping("/assingment")
 public String as(@RequestParam String faculty_id,Model map) {
	 List<assignments> listdoc = arepo.findAll(faculty_id);
	 map.addAttribute("list",listdoc);
	 return "/TrainerLogin/UploadedAssign";
 }
 
}

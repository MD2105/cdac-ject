package com.app.controller;


import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.Optional;


import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
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
import com.app.pojos.Courses;
import com.app.pojos.DataStudent;
import com.app.pojos.Students;
import com.app.pojos.assignments;
import com.app.repo.AssignmentRepository;
import com.app.repo.DocumentRepository;
import com.app.service.IStudentService;

@Controller
@RequestMapping("/studentfile")
public class StudentFileController {
	public StudentFileController() {
		System.out.println("In file");
	}
	Students srevisit = new Students();
	@Autowired
	  private IStudentService dao;
	@Autowired
	private ICourse cdao;
	@Autowired
	private AssignmentRepository ar;
	@Autowired
	private DocumentRepository repo;
	@GetMapping("/showfiles")
	public String viewHomepage(@RequestParam String student_prn,Model map) {
		List<DataStudent> listdoc = repo.findAlla(student_prn);
		map.addAttribute("list",listdoc);
		return "/StudentLogin/Submittedfiles";
	}

    @PostMapping("/upload")
    public String uploadFile(@RequestParam("document") MultipartFile mfile,@RequestParam String student_prn,@RequestParam String course_id,Model map) throws IOException
    {
    	System.out.println(student_prn);
    	String files = StringUtils.cleanPath(mfile.getOriginalFilename());
    	DataStudent doc = new DataStudent();
    	doc.setStudent_prn(student_prn);
    	doc.setCourse_id(course_id);
        doc.setDoc_name(files);
        doc.setAssignment_document(mfile.getBytes());
    	doc.setUploadtime( new Date());
    	repo.save(doc);
    	map.addAttribute("msg","Uploaded"+doc.getDoc_name());
    	return "/StudentLogin/profile";	
    	
    }
    
    @GetMapping("/download")
    public void downloadFile(@Param("id") Long id,HttpServletResponse response) throws Exception
    {
    	Optional<DataStudent> result = repo.findById(id);
    	if(!result.isPresent()) {
    		throw new Exception("Could not fine");
    		
    	}
    	
    	DataStudent docu = result.get();
       response.setContentType("application/octet-stream");
       String headerKey = "Content-Disposition";
       String headerValue = "attachment; filename="+docu.getDoc_name();
        response.setHeader(headerKey, headerValue);
    
    ServletOutputStream outstream = response.getOutputStream();
      outstream.write(docu.getAssignment_document());
      outstream.close();
      
    }
    
    @RequestMapping("/login")
    public String Form_Fill(Model map) {
    	System.out.println("In Form Fill student ");
    	Students s = new Students();
    	map.addAttribute("auths",s);
  		return "/StudentLogin/login";
    }
    
    
    @PostMapping("/login")
    protected String Auth_User(@ModelAttribute("auths") Students s,Model map,HttpSession h,Model course)
    {
    	Boolean value = false;
    	System.out.println("In post login student ");
         String name = s.getStudent_email();
         String pass = s.getStudent_password();
    	   value = dao.AuthenticateStudent(name,pass);
    	System.out.print(value);
    	if(value) {
    		srevisit.setStudent_email(name);
    		srevisit.setStudent_password(pass);
    		List<Courses> clist = cdao.getAllCourses();
    		 s = dao.getProfile(name, pass);
    		h.setAttribute("Nm_prfl",s);
    		h.setAttribute("clist",clist);
    		return "/StudentLogin/profile";
    	}
    	else {
    		map.addAttribute("msg","Invalid Username/password...Try again");
    	   return "/StudentLogin/login";
    }
  } 
   @GetMapping("/revisit")
   public String revisit(HttpSession h) {
	   List<Courses> clist = cdao.getAllCourses();
		 Students s = dao.getProfile(srevisit.getStudent_email(),srevisit.getStudent_password());
		h.setAttribute("Nm_prfl",s);
		h.setAttribute("clist",clist);
		return "/StudentLogin/profile";
	  
   }
    @GetMapping("/logout")
    public String Logout(HttpSession h,Model map,HttpServletRequest response) {
    	map.addAttribute("msg","Logged out");
    	System.out.print(h.isNew());
    	
    	h.invalidate();
    	return "redirect:/";
    }
    @RequestMapping("/ingrade")
    public String ingradeform(HttpSession h) {
    	List<Courses> clist = cdao.getAllCourses();
      
    	h.setAttribute("clist",clist);
    	return "/StudentLogin/ObtainedGrade";
    }
    
    @GetMapping("/obtaingrade")
    public String ObtainedGrade(@RequestParam String course_id,@RequestParam String student_prn,Model map) {
    	
    	System.out.print(course_id+""+student_prn);
    	String grade =dao.getGrade(course_id,student_prn);
    	 map.addAttribute("msg",grade);
	        return "/StudentLogin/ObtainedGrade";
 	      
 	    }
    
    @GetMapping("/showassi")
    public String allassignment(Model map)
    {
    	List<assignments> list = ar.findAllAssi();
    	map.addAttribute("list",list);
    	return  "/StudentLogin/allassignment";
    }
    
    
 }
    
    


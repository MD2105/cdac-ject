package com.app.service;

import java.io.UnsupportedEncodingException;
import java.sql.SQLException;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.IAdmin;
import com.app.dao.IStudentDao;
import com.app.dao.ITrainerDao;
import com.app.pojos.Courses;
import com.app.pojos.Students;
import com.app.pojos.Trainer;

@Service
@Transactional
public class RegisterService implements IRegisterService {
	  
	      @Autowired
	      private IAdmin adao;
	      @Autowired
	      private IStudentDao dao;
	      @Autowired
	      private ITrainerDao tdao;
	      @Autowired
	      private JavaMailSender sender;
	
	@Override
	public boolean add_Student(Students u) throws UnsupportedEncodingException, MessagingException {
		System.out.print("in add student service auth and register");
		Integer prn = u.getStudent_prn();
		String email = u.getStudent_email();
		try
		{
			    if(dao.searchStudent(prn, email))
			    {
			       return false;
			    }
		else 
			    {
			        dao.add_Student(u);
		            sendMailStudent(u);
			    	return true;
			    }
		}
		
		 catch(Exception e) {
			 return false;
		 }
		 
	}
	
	public void sendMailStudent(Students s) throws UnsupportedEncodingException, MessagingException {
   	 String subject = "Login Details";
   	 String senderName = "Assignment Evaluation System C-DAC";
   	 String mailContent = "<p> Dear <b>" +s.getStudent_name()+"</b> (PRN :"+s.getStudent_prn()+"),</p>";
   	 mailContent += "<p> Your<b> Login Details </b> are :"+" <br> Username : "+s.getStudent_email()+" </br> <br>Password : "+s.getStudent_password()+"</br></p>";
   	 mailContent+="<p>From,<br>Assignment Evaluation System C-DAC</br></p>";
   	 MimeMessage msg = sender.createMimeMessage();
   	 MimeMessageHelper help = new MimeMessageHelper(msg);
   	 help.setFrom("onlineassignmentsystemcdac@gmail.com",senderName);
   	 help.setTo(s.getStudent_email());
   	 help.setSubject(subject);
   	 help.setText(mailContent, true);
   	 sender.send(msg);
    }
	
	
	
	@Override
	public boolean add_Trainer(Trainer u) throws UnsupportedEncodingException, MessagingException, SQLException {
	      
			System.out.println("in Trainer Registration");
			Integer faculty_id = u.getFaculty_id();
			String email = u.getFaculty_email();
			System.out.println(tdao.searchTrainer(faculty_id,email));
			if(tdao.searchTrainer(faculty_id,email))
			{
				return false;
		      }
		else
			{
			 tdao.add_User(u);
			 sendMailTrainer(u);
		     return true;	
			}
	}
    public void sendMailTrainer(Trainer t) throws UnsupportedEncodingException, MessagingException {
   	 String subject = "Login Details";
   	 String senderName = "Assignment Evaluation System C-DAC";
   	 String mailContent = "<p> Dear Trainer Id :"+t.getFaculty_id()+",</p>";
   	 mailContent += "<p><b>Your Login Detail<b>s are Username : "+t.getFaculty_email()+" and Password : "+t.getFaculty_password()+"</p>";
   	 mailContent+="<p>From,<br>Assignment Evaluation System C-DAC</p>";
   	 MimeMessage msg = sender.createMimeMessage();
   	 MimeMessageHelper help = new MimeMessageHelper(msg);
   	 help.setFrom("onlineassignmentsystemcdac@gmail.com",senderName);
   	 help.setTo(t.getFaculty_email());
   	 help.setSubject(subject);
   	 help.setText(mailContent, true);
   	 sender.send(msg);
    }

	@Override
	public boolean add_Course(Courses c) {
		try {
			  adao.addCourse(c);
			  return true;
		}
		catch(Exception e)
		{
			return false;
		}
		
	}

}

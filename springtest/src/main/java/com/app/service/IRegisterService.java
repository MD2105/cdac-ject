package com.app.service;

import java.io.UnsupportedEncodingException;
import java.sql.SQLException;

import javax.mail.MessagingException;

import com.app.pojos.Courses;
import com.app.pojos.Students;
import com.app.pojos.Trainer;

public interface IRegisterService {
	  public boolean add_Trainer(Trainer u) throws UnsupportedEncodingException, MessagingException, SQLException;
	  public boolean add_Student(Students u) throws UnsupportedEncodingException, MessagingException;
	  public boolean add_Course(Courses c);
}

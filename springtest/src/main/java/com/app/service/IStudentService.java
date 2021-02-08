package com.app.service;

import com.app.pojos.Students;

public interface IStudentService {
	 public boolean AuthenticateStudent(String name,String pass);
	  public Students getProfile(String name,String pass);
	  public String getGrade(String course_id,String student_prn);
}

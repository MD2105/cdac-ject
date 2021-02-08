package com.app.dao;
import com.app.pojos.Students;

public interface IStudentDao { 
  public boolean AuthenticateStudent(String name,String pass);
  public boolean add_Student(Students u);
  public boolean searchStudent(Integer prn,String email);
  public Students getProfile(String name,String pass);
  public String getGrade(String course_id,String student_prn);
}

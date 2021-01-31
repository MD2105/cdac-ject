package com.app.dao;




import com.app.pojos.Students;
import com.app.pojos.Trainer;


public interface IStudentDao {
  public boolean AuthenticateUser(String name,String pass);
  public boolean AuthenticateStudent(String name,String pass);
  public String add_User(Trainer u);
  public String add_Student(Students u);
  public Students getProfile(String name,String pass);
 public boolean PuttingGrade(String grade,String student_prn);
 public String getGrade(String course_id,String student_prn);
}

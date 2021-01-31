package com.app.pojos;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="faculty_details")
public class Trainer {
  @Id
  private Integer faculty_id;
  private String faculty_name;
  private String faculty_email;
  private String faculty_password;
  
  public Trainer() 
  {  
	  
  }

public Integer getFaculty_id() {
	return faculty_id;
}

public void setFaculty_id(Integer faculty_id) {
	this.faculty_id = faculty_id;
}

public String getFaculty_name() {
	return faculty_name;
}

public void setFaculty_name(String faculty_name) {
	this.faculty_name = faculty_name;
}

public String getFaculty_email() {
	return faculty_email;
}

public void setFaculty_email(String faculty_email) {
	this.faculty_email = faculty_email;
}

public String getFaculty_password() {
	return faculty_password;
}

public void setFaculty_password(String faculty_password) {
	this.faculty_password = faculty_password;
}

@Override
public String toString() {
	return "Trainer [faculty_id=" + faculty_id + ", faculty_name=" + faculty_name + ", faculty_email=" + faculty_email
			+ ", faculty_password=" + faculty_password + "]";
}

public Trainer(Integer faculty_id, String faculty_name, String faculty_email, String faculty_password) {
	super();
	this.faculty_id = faculty_id;
	this.faculty_name = faculty_name;
	this.faculty_email = faculty_email;
	this.faculty_password = faculty_password;
}

  
}

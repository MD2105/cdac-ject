package com.app.pojos;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student")
public class Students {
	@Id
  private Integer student_prn;
  private String student_name;
	private String student_email;
	  private String student_password;
	public Students() 
	{
		
	 }
	public Integer getStudent_prn() {
		return student_prn;
	}
	public void setStudent_prn(Integer student_prn) {
		this.student_prn = student_prn;
	}
	public String getStudent_name() {
		return student_name;
	}
	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}
	public String getStudent_email() {
		return student_email;
	}
	public void setStudent_email(String student_email) {
		this.student_email = student_email;
	}
	public String getStudent_password() {
		return student_password;
	}
	public void setStudent_password(String student_password) {
		this.student_password = student_password;
	}
	@Override
	public String toString() {
		return "Students [student_prn=" + student_prn + ", student_name=" + student_name + ", student_email="
				+ student_email + ", student_password=" + student_password + "]";
	}
	public Students(Integer student_prn, String student_name, String student_email, String student_password) {
		super();
		this.student_prn = student_prn;
		this.student_name = student_name;
		this.student_email = student_email;
		this.student_password = student_password;
	}
	
	
	
}

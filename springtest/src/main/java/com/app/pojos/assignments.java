package com.app.pojos;





import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="assignments")
public class assignments {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long assignment_id;
	private String course_id;
	private String  faculty_id;
	private String doc_name;
	private byte[] assignment_description;
	private Date assignment_issued_date;
	private Date assignment_end_date;

	public assignments() {
		
	}
	public Long getAssignment_id() {
		return assignment_id;
	}
	public void setAssignment_id(Long assignment_id) {
		this.assignment_id = assignment_id;
	}
	public String getCourse_id() {
		return course_id;
	}
	public void setCourse_id(String course_id) {
		this.course_id = course_id;
	}
	public String getFaculty_id() {
		return faculty_id;
	}
	public void setFaculty_id(String faculty_id) {
		this.faculty_id = faculty_id;
	}
	public byte[] getAssignment_description() {
		return assignment_description;
	}
	public void setAssignment_description(byte[] assignment_description) {
		this.assignment_description = assignment_description;
	}
	public Date getAssignment_issued_date() {
		return assignment_issued_date;
	}
	public void setAssignment_issued_date(Date assignment_issued_date) {
		this.assignment_issued_date = assignment_issued_date;
	}
	public Date getAssignment_end_date() {
		return assignment_end_date;
	}
	public void setAssignment_end_date(Date assignment_end_date) {
		this.assignment_end_date = assignment_end_date;
	}
	public String getDoc_name() {
		return doc_name;
	}
	public void setDoc_name(String doc_name) {
		this.doc_name = doc_name;
	}
    
	public assignments(Long assignment_id, String course_id, String faculty_id, String doc_name,
			byte[] assignment_description, Date assignment_issued_date, Date assignment_end_date) {
		super();
		this.assignment_id = assignment_id;
		this.course_id = course_id;
		this.faculty_id = faculty_id;
		this.doc_name = doc_name;
		this.assignment_description = assignment_description;
		this.assignment_issued_date = assignment_issued_date;
		this.assignment_end_date = assignment_end_date;
	}

	public assignments(Long assignment_id, String course_id, String doc_name, Date assignment_issued_date,
			Date assignment_end_date) {
		super();
		this.assignment_id = assignment_id;
		this.course_id = course_id;
		this.doc_name = doc_name;
		this.assignment_issued_date = assignment_issued_date;
		this.assignment_end_date = assignment_end_date;
	}


}

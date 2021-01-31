package com.app.pojos;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="student_assignment_details")
public class DataStudent {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long assignment_id;
	private String student_prn;
	private String course_id;
	@Column(unique=true)
	private String doc_name;
	private Date uploadtime;
	private byte[] assignment_document;
	private String grade;
	
	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
		
	}

	public DataStudent() {
		
	}
	public DataStudent(String grade,String student_prn) {
		super();
		this.grade = grade;
		this.student_prn = student_prn;
		
	}
	public DataStudent(Long assignment_id, String student_prn, String doc_name) {
		super();
		this.assignment_id = assignment_id;
		this.student_prn = student_prn;
		this.doc_name = doc_name;
	}

	public String getStudent_prn() {
		return student_prn;
	}
	public void setStudent_prn(String student_prn) {
		this.student_prn = student_prn;
	}
	public String getCourse_id() {
		return course_id;
	}
	public void setCourse_id(String course_id) {
		this.course_id = course_id;
	}
	public byte[] getAssignment_document() {
		return assignment_document;
	}
	public void setAssignment_document(byte[] assignment_document) {
		this.assignment_document = assignment_document;
	}
	public Long getAssignment_id() {
		return assignment_id;
	}
	public void setAssignment_id(Long assignment_id) {
		this.assignment_id = assignment_id;
	}
	public String getDoc_name() {
		return doc_name;
	}
	public void setDoc_name(String doc_name) {
		this.doc_name = doc_name;
	}
	public Date getUploadtime() {
		return uploadtime;
	}
	public void setUploadtime(Date uploadtime) {
		this.uploadtime = uploadtime;
	}
	public DataStudent(Long assignment_id, String student_prn, String course_id, String doc_name, Date uploadtime,
			byte[] assignment_document) {
		super();
		this.assignment_id = assignment_id;
		this.student_prn = student_prn;
		this.course_id = course_id;
		this.doc_name = doc_name;
		this.uploadtime = uploadtime;
		this.assignment_document = assignment_document;
	}


	
}
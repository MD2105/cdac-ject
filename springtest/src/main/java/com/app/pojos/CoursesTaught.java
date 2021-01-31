package com.app.pojos;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="courses_taught")
public class CoursesTaught {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String course_id;
	private String faculty_id;
	private Double duration;
	public CoursesTaught() {
	}
	public CoursesTaught(String course_id, String faculty_id, Double duration) {
		//super();
		this.course_id = course_id;
		this.faculty_id = faculty_id;
		this.duration = duration;
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
	public Double getDuration() {
		return duration;
	}
	public void setDuration(Double duration) {
		this.duration = duration;
	}
	@Override
	public String toString() {
		return "CoursesTaught [course_id=" + course_id + ", faculty_id=" + faculty_id + ", duration=" + duration + "]";
	}
	
	
	
	

}

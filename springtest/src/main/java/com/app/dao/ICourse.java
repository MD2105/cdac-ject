package com.app.dao;

import java.util.List;

import com.app.pojos.Courses;

public interface ICourse {
  public List<Courses> getCourses(String faculty_id);
  public List<Courses> getAllCourses();
}

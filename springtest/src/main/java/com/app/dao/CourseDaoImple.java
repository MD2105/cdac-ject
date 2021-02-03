package com.app.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.app.pojos.Courses;
@Repository
@Transactional
public class CourseDaoImple implements ICourse {
	  public CourseDaoImple() {
		  
	  }
	  
	  @PersistenceContext
		private EntityManager mgr;
	@Override
	public List<Courses> getCourses(String faculty_id) {
		String jpql = "select c from Courses c where c.faculty_id=:faculty";
	return 	mgr.createQuery(jpql,Courses.class).setParameter("faculty",faculty_id).getResultList();
		
	}
	@Override
	public List<Courses> getAllCourses() {
		String jpql = "select c from Courses c";
		return 	mgr.createQuery(jpql,Courses.class).getResultList();
	}
	

}

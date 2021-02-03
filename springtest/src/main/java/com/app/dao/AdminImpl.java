package com.app.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.app.pojos.Courses;
@Transactional
@Repository
public class AdminImpl implements IAdmin{

	@PersistenceContext
	private EntityManager mgr;
	
	@Override
	public void addCourse(Courses c) {
		mgr.merge(c);
		
	}
	

}

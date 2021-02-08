package com.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.IStudentDao;
import com.app.pojos.Students;

@Service
@Transactional
public class StudentService implements IStudentService {
       
	@Autowired
	private IStudentDao dao;
	
	
	@Override
	public boolean AuthenticateStudent(String name, String pass) {
		if(dao.AuthenticateStudent(name, pass))
		{
			return true;
		}
		return false;
	}


	@Override
	public Students getProfile(String name, String pass) {
		return dao.getProfile(name, pass);
		
	}

	@Override
	public String getGrade(String course_id, String student_prn) {
		return dao.getGrade(course_id, student_prn);
	}

}

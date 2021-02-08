package com.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.ITrainerDao;
import com.app.pojos.Trainer;

@Service
@Transactional
public class TrainerService implements ITrainerService {     
	
	@Autowired
	private ITrainerDao dao;
	
	@Override
	public boolean AuthenticateTrainer(String name, String pass) {
		
		   Trainer t = new Trainer();
		   t = dao.AuthenticateUser(name, pass);
			if(t!=null) 
			{ 
				return true;
		    }
	   else 
	        {
		      return false;
	       }
	     
	}
	@Override
	public Trainer getProfileTrainer(String name, String pass) {
		return dao.getProfileTrainer(name, pass);
	}

	@Override
	public boolean PuttingGrade(String grade, String student_prn, String course_id) {
		
		return dao.PuttingGrade(grade, student_prn, course_id);
	}

}

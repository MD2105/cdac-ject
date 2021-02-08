package com.app.service;

import com.app.pojos.Trainer;

public interface ITrainerService {
	public boolean AuthenticateTrainer(String name,String pass);
	public Trainer getProfileTrainer(String name, String pass);
	public boolean PuttingGrade(String grade,String student_prn,String course_id);
	
}

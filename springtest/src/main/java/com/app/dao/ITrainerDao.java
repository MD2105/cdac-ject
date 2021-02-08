package com.app.dao;

import java.sql.SQLException;

import com.app.pojos.Trainer;

public interface ITrainerDao {
	public boolean add_User(Trainer u);
	public Trainer AuthenticateUser(String name,String pass);
	public Trainer getProfileTrainer(String name, String pass);
	public boolean PuttingGrade(String grade,String student_prn,String course_id);
	public boolean searchTrainer(Integer faculty_id,String email) throws SQLException;
}

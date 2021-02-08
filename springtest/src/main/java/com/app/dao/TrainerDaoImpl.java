package com.app.dao;

import java.sql.SQLException;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.app.pojos.Trainer;
@Repository
@Transactional
public class TrainerDaoImpl implements ITrainerDao {

	@PersistenceContext
	private EntityManager mgr;

	@Override
	public boolean add_User(Trainer u) {
		try {
			mgr.persist(u);
			return true;
			}
			catch (Exception e)
			{
				e.printStackTrace();
				
			}
			return false;
	}

	@Override
	public Trainer AuthenticateUser(String name, String pass) {
		
		try {
			
	         String jpql = "select t from Trainer t where t.faculty_email=:nam and t.faculty_password=:password";
	        Trainer  t = mgr.createQuery(jpql,Trainer.class).setParameter("nam", name).setParameter("password", pass).getSingleResult();
		     return t;
		    
			}
			catch(Exception e)
			{
				e.printStackTrace();
				return null;
			}	
	}

	@Override
	public Trainer getProfileTrainer(String name, String pass) {
		String jpql = "select t from Trainer t where t.faculty_email=:nam and t.faculty_password=:password";
		Trainer t = mgr.createQuery(jpql,Trainer.class).setParameter("nam", name).setParameter("password", pass).getSingleResult();
		return t;
	}

	@Override
	public boolean PuttingGrade(String grade,String student_prn,String course_id) {
	   
  try {
	  String jpql = "update DataStudent d set d.grade=:grad where d.student_prn=:studentno and d.course_id=:cou";
  int d = mgr.createQuery(jpql).setParameter("grad",grade).setParameter("studentno",student_prn).setParameter("cou",course_id).executeUpdate();
	      if(d!=0)
	      {
	    	  return true;
	      }
	      
  }
    catch (Exception e)
  {
    	e.printStackTrace();
  }

      return false;
	
	}

	@Override
	public boolean searchTrainer(Integer faculty_id,String email) throws SQLException {
	    boolean value=false;
	    try {
	    	
	    String jpql = "select t from Trainer t where t.faculty_id=:faculty and t.faculty_email=:email";
		Trainer t = mgr.createQuery(jpql,Trainer.class).setParameter("faculty",faculty_id).setParameter("email",email).getSingleResult();
		if(t.equals(t))
	    {  
		 value = true;
	     return value;
	     }
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
		   return value;
     }
		
	}

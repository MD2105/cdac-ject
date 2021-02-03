package com.app.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.app.pojos.DataStudent;
import com.app.pojos.Students;
import com.app.pojos.Trainer;


@Repository
@Transactional
public class StudentDaoImpl implements IStudentDao {
	@PersistenceContext
	private EntityManager mgr,mgr1;

	@Override
	public boolean AuthenticateUser(String name, String pass) {
		
		boolean value = false;
		try {
	  String jpql = "select t from Trainer t where t.faculty_email=:nam and t.faculty_password=:password";
	   Trainer t = mgr.createQuery(jpql,Trainer.class).setParameter("nam", name).setParameter("password", pass).getSingleResult();
	   System.out.println("jpql success");
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
	

	@Override
	public String add_User(Trainer newUser) {
		mgr.persist(newUser);
		return "Data Added Succesfully";
	}

	@Override
	public String add_Student(Students s) {
		mgr.persist(s);
		return "Data Added Succesfully";
	}


	@Override
	public boolean AuthenticateStudent(String name, String pass) {
		boolean value = false;
		try {
	  String jpql = "select s from Students s where s.student_email=:nam and s.student_password=:password";
	   Students t = mgr.createQuery(jpql,Students.class).setParameter("nam", name).setParameter("password", pass).getSingleResult();
	   System.out.println("jpql success");
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


	@Override
	public Students getProfile(String name, String pass) {
		String jpql = "select s from Students s where s.student_email=:nam and s.student_password=:password";
		Students t = mgr.createQuery(jpql,Students.class).setParameter("nam", name).setParameter("password", pass).getSingleResult();
		return t;
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
	public String getGrade(String course_id, String student_prn) {
		try {
			  String jpql = "select d from DataStudent d where  d.student_prn=:roll and d.course_id=:sub";
		  DataStudent d = mgr.createQuery(jpql,DataStudent.class).setParameter("sub",course_id)
				  .setParameter("roll",student_prn).getSingleResult();
		    String grade = d.getGrade();
		    
		  return grade;
			      
		  }
		    catch (Exception e)
		  {
		    	e.printStackTrace();
		  }
		  return  "no grade";
		}
	}

   

     


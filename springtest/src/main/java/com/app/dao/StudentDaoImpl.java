package com.app.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.app.pojos.DataStudent;
import com.app.pojos.Students;


@Repository
@Transactional
public class StudentDaoImpl implements IStudentDao {
	@PersistenceContext
	private EntityManager mgr;


	@Override
	public boolean AuthenticateStudent(String name, String pass) {
		boolean value = false;
		try {
	  String jpql = "select s from Students s where s.student_email=:nam and s.student_password=:password";
	   Students t = mgr.createQuery(jpql,Students.class).setParameter("nam", name).setParameter("password", pass).getSingleResult();
	   System.out.println("jpql success");
	   if(t!=null)
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


	@Override
	public boolean add_Student(Students u) {
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
	public boolean searchStudent(Integer prn, String email) {
		boolean value=false;
		try
		{
			String jpql = "select s from Students s where s.student_prn=:prn and s.student_email=:email";
	    Students t =  mgr.createQuery(jpql,Students.class).setParameter("prn",prn).setParameter("email",email).getSingleResult();
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

   

     


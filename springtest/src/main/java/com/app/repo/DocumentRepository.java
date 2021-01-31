package com.app.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.app.pojos.DataStudent;
@Repository
public interface DocumentRepository extends JpaRepository<DataStudent,Long> {
   
	@Query("SELECT d FROM DataStudent d ORDER BY d.uploadtime desc")
	List<DataStudent> findAll();
}
//new DataStudent(d.assignment_id,d.doc_name,d.student_prn)
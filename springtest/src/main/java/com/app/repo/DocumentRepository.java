package com.app.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.app.pojos.DataStudent;
@Repository
public interface DocumentRepository extends JpaRepository<DataStudent,Long> {
   
	@Query("SELECT d FROM DataStudent d where d.course_id=:course_id ORDER BY d.uploadtime desc")
	List<DataStudent> findAllc(String course_id);
	@Query("SELECT d FROM DataStudent d where d.student_prn=:student_prn")
	List<DataStudent> findAlla(String student_prn);
}
//new DataStudent(d.assignment_id,d.doc_name,d.student_prn)
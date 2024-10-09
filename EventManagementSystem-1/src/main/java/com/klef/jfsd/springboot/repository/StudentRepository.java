package com.klef.jfsd.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.klef.jfsd.springboot.model.Student;


@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>
{
	@Query("select c from Student c where sid=?1 and password=?2")
	public Student checklogin(int sid,String pword);
}
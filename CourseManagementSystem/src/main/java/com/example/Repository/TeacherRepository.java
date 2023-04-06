package com.example.Repository;

import java.util.List;

import javax.persistence.Id;

import org.springframework.data.jpa.repository.JpaRepository;


import com.example.Entity.Teacher;

public interface TeacherRepository extends JpaRepository<Teacher,Integer>{
	
	public List<Teacher> findTeacherByName(String tname);
	public List<Id> findTeacherById(int tid);
}

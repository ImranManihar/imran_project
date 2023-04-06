package com.example.Repository;

import java.util.List;

import javax.persistence.Id;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Entity.Course;


public interface CourseRepository extends JpaRepository<Course,Integer>{
	public List<Course> findCourseByName(String cname);
	public List<Id> findCourseById(int id);
}

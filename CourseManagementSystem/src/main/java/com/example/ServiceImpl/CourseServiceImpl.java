package com.example.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.Entity.Course;

import com.example.Repository.CourseRepository;
import com.example.Service.CourseService;

@Repository
public class CourseServiceImpl implements CourseService{
	@Autowired
	CourseRepository courseRepository;

	@Override
	public Course addCourse(Course course) {
		// TODO Auto-generated method stub
		return courseRepository.save(course);
	}

	@Override
	public List<Course> getAllCourse() {
		// TODO Auto-generated method stub
		return courseRepository.findAll();
	}

	@Override
	public void deleteCourse(int cid) {
		// TODO Auto-generated method stub
		courseRepository.deleteById(cid);
	}

	@Override
	public Course updateCourse(Course course) {
		// TODO Auto-generated method stub
		Course _course = courseRepository.findById(course.getCid()).get();
		
		_course.setCname(course.getCname());

		courseRepository.save(_course);

		return _course;
	}

	@Override
	public List<Course> getCourseByName(String cname) {
		// TODO Auto-generated method stub
	return 	courseRepository.findCourseByName(cname);
	}
	
	

}

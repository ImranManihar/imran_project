package com.example.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.Entity.Course;

import com.example.Service.CourseService;

@RestController
public class CourseController {
	@Autowired
	CourseService courseService;
	@PostMapping(value="/course")
	public Course addCourse(@RequestBody Course course)
	{
		return courseService.addCourse(course);
		
	}
	@GetMapping(value="/course")
	public List<Course> getAllCourse()
	{
		return courseService.getAllCourse();
		
	}
	@GetMapping(value = "/Course/{name}")
	public Course findCourse(@PathVariable String cname) {
		return (Course) courseService.getCourseByName(cname);
	}
	@DeleteMapping(value = "/course/{id}")
	public String deleteCourse(@PathVariable int cid) {
		courseService.deleteCourse(cid);
		return "Course is deleted from database";
	}

	@RequestMapping(value = "/course", produces = "application/json", method = RequestMethod.PUT)
	public Course updateCourse(@RequestBody Course course) {
		return courseService.updateCourse(course);
	}
	
	
	
	
	

}

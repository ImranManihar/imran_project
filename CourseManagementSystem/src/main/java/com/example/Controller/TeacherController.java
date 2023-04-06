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


import com.example.Entity.Teacher;
import com.example.Service.TeacherService;

@RestController
public class TeacherController {
  @Autowired
  TeacherService teacherService;
  
  @PostMapping(value="/teachers")
  public Teacher addTeachers(@RequestBody Teacher teacher)
  {
	return teacherService.addTeacher(teacher);
	  
  }
  @GetMapping(value="/teachers")
  public List<Teacher> getAllTeacher()
  {
	return teacherService.getAllTeacher();
	  
  }
  @GetMapping(value = "/Students/{name}")
	public Teacher findTeacher(@PathVariable String tname) {
		return (Teacher) teacherService.getTeacherByName(tname);
	}
  @DeleteMapping(value = "/teacher/{id}")
	public String deleteTeacher(@PathVariable int tid) {
		teacherService.deleteTeacher(tid);
		return "Teacher is deleted from database";
	}

	@RequestMapping(value = "/teacher", produces = "application/json", method = RequestMethod.PUT)
	public Teacher updateTeacher(@RequestBody Teacher teacher) {
		return teacherService.updateTeacher(teacher);
	}
}

package com.example.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.example.Entity.Teacher;
import com.example.Repository.TeacherRepository;
import com.example.Service.TeacherService;

@Repository
public class TeacherServiceImpl implements TeacherService{
	@Autowired
	TeacherRepository teacherRepository;

	@Override
	public Teacher addTeacher(Teacher teacher) {
		// TODO Auto-generated method stub
		return teacherRepository.save(teacher);
	}

	@Override
	public List<Teacher> getAllTeacher() {
		// TODO Auto-generated method stub
		return teacherRepository.findAll();
	}

	@Override
	public void deleteTeacher(int tid) {
		// TODO Auto-generated method stub
		teacherRepository.deleteById(tid);
	}

	@Override
	public Teacher updateTeacher(Teacher teacher) {
		// TODO Auto-generated method stub
		Teacher _teacher = teacherRepository.findById(teacher.getTid()).get();
		
		_teacher.setTname(teacher.getTname());

		teacherRepository.save(_teacher);

		return _teacher;
	}
	

	@Override
	public List<Teacher> getTeacherByName(String tname) {
		// TODO Auto-generated method stub
		
		return teacherRepository.findTeacherByName(tname);
	}
	

}

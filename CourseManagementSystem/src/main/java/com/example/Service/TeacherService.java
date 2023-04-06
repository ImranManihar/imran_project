package com.example.Service;

import java.util.List;


import com.example.Entity.Teacher;

public interface TeacherService {
public Teacher addTeacher(Teacher teacher);
public List<Teacher> getAllTeacher();
public void deleteTeacher(int tid);

public Teacher updateTeacher(Teacher teacher);

List<Teacher> getTeacherByName(String tname);
}

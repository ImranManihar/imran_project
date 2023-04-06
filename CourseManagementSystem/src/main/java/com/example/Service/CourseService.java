package com.example.Service;

import java.util.List;

import com.example.Entity.Course;


public interface CourseService {
public Course addCourse(Course course);

public List<Course> getAllCourse();

public  void deleteCourse(int cid);

public Course updateCourse(Course course);

List<Course> getCourseByName(String cname);
}

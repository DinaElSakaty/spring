package com.example.courseapi;


import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@Service
public class CourseService {
    private List<Course> courses = new ArrayList<>( Arrays.asList(
            new Course("spring", "springboot", "springbootDescription"),
            new Course("java","Java5", "JavaDescription"),
            new Course("python" , "python3" , "pythonDescription"))
    );

    public List<Course> getAllCourses(){
        return courses;
    }
    public Course getCourse(String id){
        return courses.stream().filter(t-> t.getId().equals(id)).findFirst().get();
    }
    public void addCourse(Course course){
        courses.add(course);
    }

}


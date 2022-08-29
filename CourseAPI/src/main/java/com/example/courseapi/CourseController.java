package com.example.courseapi;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CourseController {
    @Autowired
    private CourseService service;

    @RequestMapping("/courses")
    public List<Course> getCourses(){

        return service.getAllCourses();
    }
    @RequestMapping("/courses/{id}")
    public Course getCourse(@PathVariable String id){
        return service.getCourse(id);
    }
    @RequestMapping(method = RequestMethod.POST,value = "/courses")
    public void addCourse(@RequestBody Course course){
        service.addCourse(course);
    }


}


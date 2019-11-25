package abhi.springframework.courseapi.controllers;

import abhi.springframework.courseapi.model.Course;
import abhi.springframework.courseapi.model.Topic;
import abhi.springframework.courseapi.services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class CourseController {

    @Autowired
    private CourseService courseService;

    @GetMapping("/api/topics/{topicId}/courses")
    public List<Course> getAllCourses(@PathVariable String topicId){
        return courseService.getAllCourses(topicId);
    }

    @GetMapping("/api/topics/{topicId}/courses/{id}")
    public Optional<Course> getCourseById(@PathVariable String id){
        return courseService.getCourse(id);
    }

    @PostMapping("/api/topics/{topicId}/courses")
    public void addCourse(@RequestBody Course course, @PathVariable String topicId){
        course.setTopic(new Topic(topicId, "", ""));
        courseService.addCourse(course);
    }

    @PutMapping("/api/topics/{topicId}/courses/{id}")
    public void updateCourse(@RequestBody Course course, @PathVariable String topicId,@PathVariable String id){
        course.setTopic(new Topic(topicId, "", ""));
        courseService.updateCourse(course);
    }

    @DeleteMapping("/api/topics/{topicsId}/courses/{id}")
    public void deleteCourse(@PathVariable String id){
        courseService.deleteCourse(id);
    }


}

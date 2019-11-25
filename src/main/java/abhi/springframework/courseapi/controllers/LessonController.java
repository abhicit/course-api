package abhi.springframework.courseapi.controllers;

import abhi.springframework.courseapi.model.Course;
import abhi.springframework.courseapi.model.Lesson;
import abhi.springframework.courseapi.services.LessonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class LessonController {

    @Autowired
    private LessonService lessonService;

    @GetMapping("/api/topics/{topicId}/courses/{courseId}/lesson")
    public List<Lesson> getAllLesson(@PathVariable String courseId){
        return lessonService.getAllLesson(courseId);
    }

    @GetMapping("/api/topics/{topicId}/courses/{courseId}/lesson/{id}")
    public Optional<Lesson> getLessonById(@PathVariable String id){
        return lessonService.getLessonById(id);
    }

    @PostMapping("/api/topics/{topicId}/courses/{courseId}/lesson")
    public void addLesson(@RequestBody Lesson lesson, @PathVariable String courseId){
        lesson.setCourse(new Course(courseId, "", ""));
        lessonService.addLesson(lesson);
    }

    @PutMapping("/api/topics/{topicId}/courses/{courseId}/lesson/{id}")
    public void updateLesson(@RequestBody Lesson lesson, @PathVariable String courseId, @PathVariable String id){
        lesson.setCourse(new Course(courseId, "", ""));
        lessonService.updateLesson(lesson);
    }

    @DeleteMapping("/api/topics/{topicId}/courses/{courseId}/lesson/{id}")
    public void deleteLesson(@PathVariable String id){
        lessonService.deleteLesson(id);
    }

}

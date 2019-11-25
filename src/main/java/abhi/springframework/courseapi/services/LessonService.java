package abhi.springframework.courseapi.services;

import abhi.springframework.courseapi.model.Lesson;
import abhi.springframework.courseapi.repository.LessonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class LessonService {

    @Autowired
    private LessonRepository lessonRepository;

    public List<Lesson> getAllLesson(String id){
        List<Lesson> lessons = new ArrayList<>();
        lessonRepository.getLessonByCourseId(id)
                .forEach(lessons::add);
        return lessons;
    }

    public Optional<Lesson> getLessonById(String id){
        return lessonRepository.findById(id);
    }

    public void addLesson(Lesson lesson){
        lessonRepository.save(lesson);
    }

    public void updateLesson(Lesson lesson){
        lessonRepository.save(lesson);
    }

    public void deleteLesson(String id){
        lessonRepository.deleteById(id);
    }

}

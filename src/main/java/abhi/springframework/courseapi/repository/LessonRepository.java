package abhi.springframework.courseapi.repository;

import abhi.springframework.courseapi.model.Lesson;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LessonRepository extends JpaRepository<Lesson, String> {
    public List<Lesson> getLessonByCourseId(String courseId);
}

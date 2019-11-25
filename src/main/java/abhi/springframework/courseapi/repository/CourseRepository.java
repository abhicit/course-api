package abhi.springframework.courseapi.repository;

import abhi.springframework.courseapi.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourseRepository extends JpaRepository<Course, String> {
    public List<Course> getCoursesByTopicId(String topicId);
}

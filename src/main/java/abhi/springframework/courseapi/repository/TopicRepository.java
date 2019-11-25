package abhi.springframework.courseapi.repository;

import abhi.springframework.courseapi.model.Topic;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TopicRepository extends CrudRepository<Topic, String> {
}

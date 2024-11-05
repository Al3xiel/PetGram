package petgram.petgramapi.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import petgram.petgramapi.model.Tag;

@Repository
public interface TagRepository extends MongoRepository<Tag, String> {
}

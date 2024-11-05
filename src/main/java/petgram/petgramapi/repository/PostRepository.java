package petgram.petgramapi.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import petgram.petgramapi.model.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {
}

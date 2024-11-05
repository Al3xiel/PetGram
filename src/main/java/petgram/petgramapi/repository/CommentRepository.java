package petgram.petgramapi.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import petgram.petgramapi.model.Comment;

@Repository
public interface CommentRepository extends MongoRepository<Comment, String> {
}

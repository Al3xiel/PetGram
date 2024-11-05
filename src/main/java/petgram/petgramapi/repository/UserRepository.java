package petgram.petgramapi.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import petgram.petgramapi.model.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
}

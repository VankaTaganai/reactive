package am.panov.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import am.panov.models.User;

@Repository
public interface UserRepository extends ReactiveMongoRepository<User, String> { }

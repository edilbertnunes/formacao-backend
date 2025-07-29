package br.com.edilbert.userserviceapi.repository;

import br.com.edilbert.userserviceapi.entity.User;
import com.mongodb.client.DistinctIterable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
    Optional<User> findByEmail(final String email);
}

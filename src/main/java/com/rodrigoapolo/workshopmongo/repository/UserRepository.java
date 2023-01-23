package com.rodrigoapolo.workshopmongo.repository;

import com.rodrigoapolo.workshopmongo.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {
}

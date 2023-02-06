package com.rodrigoapolo.workshopmongo.repository;

import com.rodrigoapolo.workshopmongo.domain.Post;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PostRepository extends MongoRepository<Post, String> {
}

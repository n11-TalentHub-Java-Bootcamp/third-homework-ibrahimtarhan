package com.tarhan.springboot.mongoDb.repository;

import com.tarhan.springboot.mongoDb.entity.Comment;
import com.tarhan.springboot.mongoDb.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentRepository extends MongoRepository<Comment, String> {
}

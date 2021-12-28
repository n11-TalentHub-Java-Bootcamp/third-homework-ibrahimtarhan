package com.tarhan.springboot.mongoDb.repository;

import com.tarhan.springboot.mongoDb.entity.Category;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends MongoRepository<Category, String> {
}

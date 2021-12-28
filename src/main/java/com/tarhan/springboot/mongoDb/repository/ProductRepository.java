package com.tarhan.springboot.mongoDb.repository;

import com.tarhan.springboot.mongoDb.dto.ProductDetailDto;
import com.tarhan.springboot.mongoDb.entity.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends MongoRepository<Product, String> {
    List<Product> findAllByCategoryId(String categoryId);

    ProductDetailDto findProductDetailDtoById(String id);
}

package com.tarhan.springboot.mongoDb.service;

import com.tarhan.springboot.mongoDb.dto.ProductDetailDto;
import com.tarhan.springboot.mongoDb.entity.Product;

import java.util.List;

public interface ProductService {
    List<Product> findAll();

    Product findById(String id);

    ProductDetailDto findProductDetailDtoById(String id);

    Product save(Product product);

    void deleteById(String id);

    List<ProductDetailDto> findAllProductByCategoryId(String categoryId);
}

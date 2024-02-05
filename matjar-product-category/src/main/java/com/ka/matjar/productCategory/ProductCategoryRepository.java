package com.ka.matjar.productCategory;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductCategoryRepository extends MongoRepository<ProductCategory, String> {
}

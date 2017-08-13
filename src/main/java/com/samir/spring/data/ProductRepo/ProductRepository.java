package com.samir.spring.data.ProductRepo;

import org.springframework.data.repository.CrudRepository;

import com.samir.spring.data.entities.Product;

public interface ProductRepository extends CrudRepository<Product, Long> {

}

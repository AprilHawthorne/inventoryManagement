package com.promineotech.intentoryManagement.repository;

import org.springframework.data.repository.CrudRepository;

import com.promineotech.intentoryManagement.entity.Product;

public interface ProductRepository extends CrudRepository<Product, Long> {

}

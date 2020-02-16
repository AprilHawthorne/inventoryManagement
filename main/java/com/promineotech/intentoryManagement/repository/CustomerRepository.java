package com.promineotech.intentoryManagement.repository;

import org.springframework.data.repository.CrudRepository;

import com.promineotech.intentoryManagement.entity.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long> {

}

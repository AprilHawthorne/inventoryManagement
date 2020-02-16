package com.promineotech.intentoryManagement.repository;

import org.springframework.data.repository.CrudRepository;

import com.promineotech.intentoryManagement.entity.Order;

public interface OrderRepository extends CrudRepository<Order, Long> {

}

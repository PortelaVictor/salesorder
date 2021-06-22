package com.vportela.salesorder.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vportela.salesorder.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}

package com.vportela.salesorder.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vportela.salesorder.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
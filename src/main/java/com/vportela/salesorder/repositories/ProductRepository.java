package com.vportela.salesorder.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vportela.salesorder.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}

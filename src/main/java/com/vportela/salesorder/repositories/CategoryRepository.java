package com.vportela.salesorder.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vportela.salesorder.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}

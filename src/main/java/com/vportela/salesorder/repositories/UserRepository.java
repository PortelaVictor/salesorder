package com.vportela.salesorder.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vportela.salesorder.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}

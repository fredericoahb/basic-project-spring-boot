package com.fredericoahb.trainee.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fredericoahb.trainee.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
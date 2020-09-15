package com.fredericoahb.trainee.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fredericoahb.trainee.entities.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

}

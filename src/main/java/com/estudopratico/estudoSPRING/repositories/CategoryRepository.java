package com.estudopratico.estudoSPRING.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estudopratico.estudoSPRING.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
    
}

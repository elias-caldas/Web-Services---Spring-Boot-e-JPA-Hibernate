package com.estudopratico.estudoSPRING.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estudopratico.estudoSPRING.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
    
}

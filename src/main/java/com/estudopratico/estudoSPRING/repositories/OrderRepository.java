package com.estudopratico.estudoSPRING.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estudopratico.estudoSPRING.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}

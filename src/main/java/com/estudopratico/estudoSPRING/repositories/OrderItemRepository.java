package com.estudopratico.estudoSPRING.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estudopratico.estudoSPRING.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}

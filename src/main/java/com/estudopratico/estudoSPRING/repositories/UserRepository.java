package com.estudopratico.estudoSPRING.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estudopratico.estudoSPRING.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}

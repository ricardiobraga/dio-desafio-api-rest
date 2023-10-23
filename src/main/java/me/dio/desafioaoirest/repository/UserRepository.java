package me.dio.desafioaoirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import me.dio.desafioaoirest.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    
}

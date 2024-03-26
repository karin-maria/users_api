package com.brotjefors.users.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.brotjefors.users.models.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}

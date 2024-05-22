package com.eduinx.userservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eduinx.userservice.entity.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}

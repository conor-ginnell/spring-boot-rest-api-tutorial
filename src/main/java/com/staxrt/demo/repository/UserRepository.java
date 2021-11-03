package com.staxrt.demo.repository;

import com.staxrt.demo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long>{}

package com.projects.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projects.api.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}

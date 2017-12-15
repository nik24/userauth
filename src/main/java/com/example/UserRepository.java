package com.example;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by nikhil on 12/15/17
 */
public interface UserRepository extends JpaRepository<UserEntity, Integer> {
}

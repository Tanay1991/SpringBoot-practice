package com.spring.practices.dao;

import com.spring.practices.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserDetailsDao extends JpaRepository<User,Long> {
    Optional<User> findByUsername(String username);
}

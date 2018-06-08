package com.ozads.fut.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ozads.fut.Entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}

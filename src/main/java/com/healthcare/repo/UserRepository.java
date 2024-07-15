package com.healthcare.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.healthcare.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	// write logic for finding User by email

	// write logic for finding all users by username
}

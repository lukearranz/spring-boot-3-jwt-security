package com.pivotSoftware.apiBase.repository;

import java.util.Optional;

import com.pivotSoftware.apiBase.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

  Optional<User> findByEmail(String email);

}

package com.example.cwiczenia2sztucznainteligencja.repository;

import com.example.cwiczenia2sztucznainteligencja.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
}

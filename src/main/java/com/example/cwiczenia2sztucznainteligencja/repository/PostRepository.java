package com.example.cwiczenia2sztucznainteligencja.repository;

import com.example.cwiczenia2sztucznainteligencja.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<Post,Long> {
}

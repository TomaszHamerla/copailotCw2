package com.example.cwiczenia2sztucznainteligencja.repository;

import com.example.cwiczenia2sztucznainteligencja.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment,Long> {
}

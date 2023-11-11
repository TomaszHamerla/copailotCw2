package com.example.cwiczenia2sztucznainteligencja.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String text;
    @ManyToOne
    private User user;
    @ManyToOne
    private Post post;

}


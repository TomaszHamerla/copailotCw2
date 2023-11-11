package com.example.cwiczenia2sztucznainteligencja.controller;

import com.example.cwiczenia2sztucznainteligencja.service.PostService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class PostController {
    private final PostService postService;
    @GetMapping("/fetchAndAnalyze")
    public String fetchAndAnalyzePosts() {
        postService.fetchAndSavePosts();
        return "Posts fetched and analyzed successfully!";
    }

}

package com.example.cwiczenia2sztucznainteligencja.service;

import com.example.cwiczenia2sztucznainteligencja.model.Comment;
import com.example.cwiczenia2sztucznainteligencja.model.Post;
import com.example.cwiczenia2sztucznainteligencja.model.User;
import com.example.cwiczenia2sztucznainteligencja.repository.CommentRepository;
import com.example.cwiczenia2sztucznainteligencja.repository.PostRepository;
import com.example.cwiczenia2sztucznainteligencja.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@RequiredArgsConstructor
public class DataBaseService {
    private final PostRepository postRepository;
    private final CommentRepository commentRepository;
    private final UserRepository userRepository;
    private final RestTemplate restTemplate;
    @Value("${myValue.url}")
    private String url;


    public void saveData() {
        Post[] posts = restTemplate.getForObject(url + "/posts", Post[].class);
        Comment[] comments = restTemplate.getForObject(url + "/comments", Comment[].class);
        User[] users = restTemplate.getForObject(url + "/users", User[].class);

        for (Post post : posts) {
            postRepository.save(post);
        }
        for (Comment comment : comments) {
            commentRepository.save(comment);
        }
        for (User user : users) {
            userRepository.save(user);
        }
    }



}

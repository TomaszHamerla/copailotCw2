package com.example.cwiczenia2sztucznainteligencja.service;

import com.example.cwiczenia2sztucznainteligencja.model.Post;
import com.example.cwiczenia2sztucznainteligencja.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class PostService {
    private final RestTemplate restTemplate;
    private final PostRepository postRepository;
    @Value("${myValue.url}")
    private String url;

    public void fetchAndSavePosts(){
        Map<Character, Integer> alphabetCount = new HashMap<>();
        for (int i=1;i<=100;i++){
            String postURL=url+"/posts/"+i;
            try{
                Post post =restTemplate.getForObject(postURL, Post.class);
                if (post!=null){
                    postRepository.save(post);
                    countAlphabets(post.getBody(),alphabetCount);
                }
            }catch (HttpClientErrorException e){
                e.printStackTrace();
            }

        }
        System.out.println("Zliczenie wystąpień liter alfabetu:");
        for (char c = 'a'; c <= 'z'; c++) {
            int count = alphabetCount.getOrDefault(c, 0);
            if (count > 0) {
                System.out.println(c + ": " + count);
            }
        }
    }
    private void countAlphabets(String body, Map<Character, Integer> alphabetCount) {
        for (char c : body.toCharArray()) {
            if (Character.isLetter(c)) {
                c = Character.toLowerCase(c);
                alphabetCount.put(c, alphabetCount.getOrDefault(c, 0) + 1);
            }
        }
    }



}

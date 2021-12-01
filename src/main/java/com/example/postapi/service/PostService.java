package com.example.postapi.service;

import com.example.postapi.entity.Post;
import com.example.postapi.request.PostRequest;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface PostService {
    void create(PostRequest request);
    List<Post> getAllPosts();
    List<Post> search(String keyword, Pageable pageable);
    void update(Integer id, PostRequest request);
    void delete(Integer id);
}

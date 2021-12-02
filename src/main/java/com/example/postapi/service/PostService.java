package com.example.postapi.service;

import com.example.postapi.entity.Post;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface PostService {
    List<Post> getAllPosts();
    List<Post> searchPosts(String keyword, Pageable pageable);
    List<Post> desHeart();
}

package com.example.postapi.service;

import com.example.postapi.entity.Post;
import com.example.postapi.entity.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PostServiceImpl implements PostService {

    private final PostRepository postRepository;

    @Override
    public List<Post> getAllPosts() {
        return postRepository.findAll();
    }

    @Override
    public List<Post> searchPosts(String keyword, Pageable pageable) {
        return postRepository.findByNameContaining(keyword, pageable);
    }

    @Override
    public List<Post> desHeart() {
        return postRepository.desHeart();
    }
}

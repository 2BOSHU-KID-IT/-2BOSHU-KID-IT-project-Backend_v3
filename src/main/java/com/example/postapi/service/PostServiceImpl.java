package com.example.postapi.service;

import com.example.postapi.entity.Post;
import com.example.postapi.entity.PostRepository;
import com.example.postapi.entity.Near;
import com.example.postapi.entity.NearRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PostServiceImpl implements PostService {

    private final PostRepository postRepository;
    private final NearRepository reviewRepository;

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

    @Override
    public List<Near> near(){
        return reviewRepository.findAll();
    }
}

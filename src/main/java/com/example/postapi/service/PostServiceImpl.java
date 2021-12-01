package com.example.postapi.service;

import com.example.postapi.entity.Post;
import com.example.postapi.entity.PostRepository;
import com.example.postapi.request.PostRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PostService {

    private final PostRepository postRepository;

    public void create(PostRequest request){
        Post post = Post.builder()
                .address(request.getAddress())
                .division(request.getDivision())
                .name(request.getName())
                .number(request.getNumber())
                .heart(request.getHeart())
                .build();

        postRepository.save(post);
    }

    public void update(Integer id, PostRequest request){
        Post post = postRepository.findById(id).get();
        post.setHeart(request.getHeart());
    }

    public List<Post> getAllPost(){
        return postRepository.findAll();
    }

    public List<Post> search(String keyword, Pageable pageable){
        return postRepository.
    }

    public void delete(Integer id){
        postRepository.deleteById(id);
    }
}

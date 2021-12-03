package com.example.postapi.api;

import com.example.postapi.entity.Post;
import com.example.postapi.entity.Near;
import com.example.postapi.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/posts")
public class PostController {

    private final PostService postService;

    @GetMapping("/list")
    public List<Post> getAllPosts(){
        return postService.getAllPosts();
    }

    @GetMapping("/search")
    public List<Post> searchPosts(@RequestParam(value = "keyword") String keyword, Pageable pageable) {
        return postService.searchPosts(keyword, pageable);
    }

    @GetMapping("/des")
    public List<Post> desHeart(){
        return postService.desHeart();
    }

    @GetMapping("/near")
    public List<Near> near(){
        return postService.near();
    }
}

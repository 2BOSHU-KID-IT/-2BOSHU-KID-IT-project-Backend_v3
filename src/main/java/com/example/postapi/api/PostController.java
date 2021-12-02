package com.example.postapi.api;

import com.example.postapi.entity.Post;
import com.example.postapi.service.PostServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/posts")
@CrossOrigin(origins = "localhost:3000")
public class PostController {

    private final PostServiceImpl postService;

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
}

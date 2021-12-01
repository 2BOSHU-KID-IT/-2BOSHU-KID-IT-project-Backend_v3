package com.example.postapi.api;

import com.example.postapi.entity.Post;
import com.example.postapi.request.PostRequest;
import com.example.postapi.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/post")
public class PostController {

    private final PostService postService;

    @PostMapping("/create")
    public void create(@RequestBody PostRequest request){
        postService.create(request);
    }

    @GetMapping("/list")
    public List<Post> getAllPost(){
        return postService.getAllPost();
    }

    @PatchMapping("/{id}")
    public void update(@PathVariable Integer id, @RequestBody PostRequest request){
        postService.update(id, request);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id){
        postService.delete(id);
    }

}

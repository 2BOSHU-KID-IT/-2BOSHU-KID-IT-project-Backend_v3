package com.example.postapi.api;

import com.example.postapi.entity.Post;
import com.example.postapi.request.PostRequest;
import com.example.postapi.service.PostServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class PostController {

    private final PostServiceImpl postService;

    @PostMapping("/create")
    public void create(@RequestBody PostRequest request){
        postService.create(request);
    }

    @GetMapping("/list")
    public List<Post> getAllPosts(){
        return postService.getAllPosts();
    }

    @GetMapping("/search")
    public List<Post> search(@RequestParam(value = "keyword") String keyword, Pageable pageable) {
        return postService.search(keyword, pageable);
    }


    @PatchMapping("/update/{id}")
    public void update(@PathVariable Integer id, @RequestBody PostRequest request){
        postService.update(id, request);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Integer id){
        postService.delete(id);
    }

}

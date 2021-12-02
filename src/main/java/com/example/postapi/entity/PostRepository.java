package com.example.postapi.entity;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PostRepository extends JpaRepository<Post, Integer> {
    List<Post> findByNameContaining(String keyword, Pageable pageable);

    @Query(value = "select * from post order by heart desc", nativeQuery = true)
    List<Post> desHeart();
}

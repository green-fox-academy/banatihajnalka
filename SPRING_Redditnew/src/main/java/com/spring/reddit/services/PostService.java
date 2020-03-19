package com.spring.reddit.services;

import com.spring.reddit.models.Post;
import com.spring.reddit.repositories.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {

    private PostRepository postRepository;

    @Autowired
    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public List<Post> findAll() {
       return postRepository.findAll();
    }

    public void addPost(Post post) {
        postRepository.save(post);
    }
}

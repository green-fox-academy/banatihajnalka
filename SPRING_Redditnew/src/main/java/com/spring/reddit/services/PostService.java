package com.spring.reddit.services;

import com.spring.reddit.models.Post;
import com.spring.reddit.repositories.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    public Post findById(Long id) {
        Optional<Post> todo = postRepository.findById(id);
        return todo.orElse(null);
    }

    public void increasePostVote(Long id) {
        Optional<Post> optionalPost = postRepository.findById(id);
        if (optionalPost.isPresent()) {
            Post post = optionalPost.get();
            post.setVote(post.getVote() + 1);
            postRepository.save(post);
        }
    }

    public void decreasePostVote(Long id) {
        Optional<Post> optionalPost = postRepository.findById(id);
        if (optionalPost.isPresent()) {
            Post post = optionalPost.get();
            post.setVote(post.getVote() - 1);
            postRepository.save(post);
        }
    }
}

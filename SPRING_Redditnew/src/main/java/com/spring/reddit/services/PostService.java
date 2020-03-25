package com.spring.reddit.services;

import com.spring.reddit.models.Post;
import com.spring.reddit.models.User;
import com.spring.reddit.models.Vote;
import com.spring.reddit.repositories.PostRepository;
import com.spring.reddit.repositories.UserRepository;
import com.spring.reddit.repositories.VoteRepository;
import javafx.geometry.Pos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

@Service
public class PostService {

    private PostRepository postRepository;
    private UserRepository userRepository;

    @Autowired
    public PostService(PostRepository postRepository, UserRepository userRepository) {
        this.postRepository = postRepository;
        this.userRepository = userRepository;
    }

    public List<Post> findAll() {
        return postRepository.findAllByOrderByVoteDesc();
    }

    public void addPost(Post post) {
        postRepository.save(post);
    }

//    public Post findById(Long id) {
//        Optional<Post> t = postRepository.findById(id);
//        todo.get().
//        return todo.orElse(null);
//    }

    public void increasePostVote(Long id, String userName) {
        Optional<Post> optionalPost = postRepository.findById(id);
        if (optionalPost.isPresent()) {
            Post post = optionalPost.get();
            Optional<User> optionalUser = userRepository.findUserByUserName(userName);
            if (optionalUser.isPresent()) {
                User user = optionalUser.get();
                if (!isVotedForThisPost(id, userName, post)) {
                    post.setVote(post.getVote() + 1);
                    Vote newVote = new Vote(1, user, post);
                    post.addVotes(newVote);
                    postRepository.save(post);
                }
            }
        }
    }

    private boolean isVotedForThisPost(Long id, String username, Post post) {
        Optional<User> currentUser = userRepository.findUserByUserName(username);
        if (currentUser.isPresent()) {
            List<Post> posts = currentUser.get().getPosts();
            if (posts.contains(post)) {
                return true;
            }
            List<Vote> votes = post.getVotes();
            for (Vote vote : votes) {
                if (vote.getUser().getUserName().equals(username)) {
                    return true;
                }
            }
        }
        return false;
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

package com.spring.reddit.services;

import com.spring.reddit.models.Post;
import com.spring.reddit.models.User;
import com.spring.reddit.models.Vote;
import com.spring.reddit.repositories.PostRepository;
import com.spring.reddit.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

    public void increasePostVote(Long id, String userName) {
        Optional<Post> optionalPost = postRepository.findById(id);
        Optional<User> optionalUser = userRepository.findUserByUserName(userName);
        if (optionalPost.isPresent() && optionalUser.isPresent()) {
            Post post = optionalPost.get();
            User user = optionalUser.get();
            List<Post> userPosts = user.getPosts();
            if (!userPosts.contains(post) && (!isVoted(id, userName))) {
                post.setVote(post.getVote() + 1);
                Vote newVote = new Vote(1, user, post);
                post.addVotes(newVote);
                postRepository.save(post);
            } else {
                List<Vote> votes = post.getVotes();
                for (Vote vote : votes) {
                    if (vote.getVote() == -1) {
                        post.setVote(post.getVote() + 2);
                        vote.setVote(1);
                        postRepository.save(post);
                    }
                }
            }
        }
    }

    public void decreasePostVote(Long id, String userName) {
        Optional<Post> optionalPost = postRepository.findById(id);
        Optional<User> optionalUser = userRepository.findUserByUserName(userName);
        if (optionalPost.isPresent() && optionalUser.isPresent()) {
            Post post = optionalPost.get();
            User user = optionalUser.get();
            List<Post> userPosts = user.getPosts();
            if (!userPosts.contains(post) && (!isVoted(id, userName))) {
                post.setVote(post.getVote() - 1);
                Vote newVote = new Vote(-1, user, post);
                post.addVotes(newVote);
                postRepository.save(post);
            } else {
                List<Vote> votes = post.getVotes();
                for (Vote vote : votes) {
                    if (vote.getVote() == 1) {
                        post.setVote(post.getVote() - 2);
                        vote.setVote(-1);
                        postRepository.save(post);
                    }
                }
            }
        }
    }

    private boolean isVoted(Long id, String userName) {
        Optional<Post> optionalPost = postRepository.findById(id);
        List<Vote> votes = optionalPost.get().getVotes();
        for (Vote vote : votes) {
            if (vote.getUser().getUserName().equals(userName)) {
                return true;
            }
        }
        return false;
    }
}
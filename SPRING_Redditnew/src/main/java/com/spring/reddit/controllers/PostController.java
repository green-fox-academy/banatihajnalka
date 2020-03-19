package com.spring.reddit.controllers;

import com.spring.reddit.models.Post;
import com.spring.reddit.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PostController {

    private PostService postService;

    @Autowired
    public PostController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping("/")
    public String renderPostPage(Model model) {
        model.addAttribute("posts", postService.findAll());
        return "posts";
    }

    @GetMapping("/submit")
    public String renderSubmitPage(Model model) {
        model.addAttribute("post", new Post());
        return "submit";
    }

    @PostMapping("/submit")
    public String submitPost(@ModelAttribute Post post) {
        postService.addPost(post);
        return "redirect:/";
    }

    @PostMapping("/{id}/increase")
    public String increasePostVote(@PathVariable Long id) {
        postService.increasePostVote(id);
        return "redirect:/";
    }

    @PostMapping("/{id}/decrease")
    public String decreasePostVote(@PathVariable Long id) {
        postService.increasePostVote(id);
        return "redirect:/";
    }

}

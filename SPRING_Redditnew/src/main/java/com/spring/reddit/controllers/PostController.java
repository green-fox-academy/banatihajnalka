package com.spring.reddit.controllers;

import com.spring.reddit.models.Post;
import com.spring.reddit.services.PostService;
import com.spring.reddit.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class PostController {

    private PostService postService;
    private UserService userService;

    @Autowired
    public PostController(PostService postService, UserService userService) {
        this.postService = postService;
        this.userService = userService;
    }

    @GetMapping(value = {"/"})
    public String renderPostPage(Model model, @RequestParam String name) {
        if (userService.isExistsByName(name)) {
            model.addAttribute("posts", postService.findAll());
            return "posts";
        }
        return "redirect:/register";
    }

    @GetMapping("/{name}/submit")
    public String renderSubmitPage(@PathVariable String name, Model model) {
        model.addAttribute("post", new Post());
        return "submit";
    }

    @PostMapping("/{name}/submit")
    public String submitPost(@PathVariable String name, @ModelAttribute Post post) {
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
        postService.decreasePostVote(id);
        return "redirect:/";
    }

}

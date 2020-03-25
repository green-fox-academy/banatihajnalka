package com.spring.reddit.controllers;

import com.spring.reddit.models.Post;
import com.spring.reddit.models.User;
import com.spring.reddit.models.Vote;
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
    public String renderPostPage(Model model, @RequestParam String userName) {
//    public String renderPostPage(Model model, Long userId) {
//        if (userService.isExistsByUserId(userId)) {
        if (userService.isExistsByName(userName)) {
            model.addAttribute("user", userService.findUserByName(userName));
            model.addAttribute("posts", postService.findAll());
            return "posts";
        }
        return "redirect:/register";
    }

    @GetMapping("/{userName}/submit")
    public String renderSubmitPage(@PathVariable String userName, Model model) {
        model.addAttribute("post", new Post());
        model.addAttribute("user", userService.findUserByName(userName));
        return "submit";
    }

    @PostMapping("/{userName}/submit")
    public String submitPost(@PathVariable String userName, @ModelAttribute Post post) {
        post.setUser(userService.findUserByName(userName));
        postService.addPost(post);
        return "redirect:/?userName="+userName;
    }

    @PostMapping("/{userName}/{id}/increase")
    public String increasePostVote(@PathVariable String userName, @PathVariable Long id) {
        postService.increasePostVote(id, userName);
        return "redirect:/?userName="+userName;
    }

    @PostMapping("/{userName}/{id}/decrease")
    public String decreasePostVote(@PathVariable Long id, @PathVariable String userName) {
        postService.decreasePostVote(id);
        return "redirect:/?userName="+userName;
    }

}

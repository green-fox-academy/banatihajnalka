package com.spring.reddit;

import com.spring.reddit.models.Post;
import com.spring.reddit.repositories.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RedditApplication implements CommandLineRunner {

    private PostRepository postRepository;

    @Autowired
    public RedditApplication(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(RedditApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
//        postRepository.save(new Post("Excellent tool for making presentations", "https://slidesgo.com"));
//        postRepository.save(new Post("Good way to practice Java", "https://data-flair.training/blogs/java-quiz-questions/"));
//        postRepository.save(new Post("Looking around in an aquarium", "https://www.montereybayaquarium.org/animals/live-cams?fbclid=IwAR1Vaw3fEBK85lZOxCoqp6pSR48gvFpmHKEl3B5Nmp7HebIjmKg83iwZ1us"));
    }
}

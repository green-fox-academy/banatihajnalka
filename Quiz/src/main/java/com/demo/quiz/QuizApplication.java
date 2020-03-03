package com.demo.quiz;

import com.demo.quiz.models.entities.Question;
import com.demo.quiz.repositories.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class QuizApplication implements CommandLineRunner {

    private QuestionRepository questionRepository;

    @Autowired
    public QuizApplication(QuestionRepository questionRepository) {
        this.questionRepository = questionRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(QuizApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        questionRepository.save(new Question("java.util.Collections is a", "Class", "Interface", "Object", "None of above", "Class"));
        questionRepository.save(new Question("Which of those allows duplicate elements?", "Set", "List", "All", "None of above", "List"));
        questionRepository.save(new Question("ArrayList implements that of the following?", "List", "RandomAccess", "Cloneable", "All of these", "All of these"));
        questionRepository.save(new Question("Which of those permits the storage of the many null values?", "Set", "List", "None of above", "All of these", "All of these"));
        questionRepository.save(new Question("Which allows the removal of elements from a collection?", "Enumeration", "Iterator", "None of the above", "Both", "None of the above"));
    }
}

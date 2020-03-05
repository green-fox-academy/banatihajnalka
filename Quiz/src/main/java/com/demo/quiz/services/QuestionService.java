package com.demo.quiz.services;

import com.demo.quiz.models.entities.Question;
import com.demo.quiz.repositories.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;


@Service
public class QuestionService {

    private QuestionRepository questionRepository;

    @Autowired
    public QuestionService(QuestionRepository questionRepository) {
        this.questionRepository = questionRepository;
    }


    public List<Question> findAllWAsNotUSed() {
        return questionRepository.findAllByIsUsed(false);
    }

    public Question findByIsUsed() {
        Optional<Question> question = findAllWAsNotUSed().stream().findFirst();
        question.ifPresent(value -> value.setIsUsed(true));
        return question.orElse(null);
    }

    public Optional<Question> getRandomQuestionList() {
        List<Question> questions = new ArrayList<>();
        int id = 0;
        Optional<Question> question = questionRepository.findById(id);
        question.ifPresent(questions::add);
        return question;
    }


    public void addAnswer(Question question) {
        questionRepository.save(question);
    }
}


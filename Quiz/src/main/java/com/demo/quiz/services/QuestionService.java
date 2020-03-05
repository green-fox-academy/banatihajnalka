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


    public Iterable<Question> findAllWAsNotUSed() {
        return questionRepository.findAllByIsUsed(false);
    }

    public Question findByIsUsed() {
        List<Question> findAllWAsNotUSed = questionRepository.findAllByIsUsed(false);
        Optional<Question> question = findAllWAsNotUSed.stream().findFirst();
//        Optional<Question> question = questionRepository.findByIsUsed(false);
        question.ifPresent(value -> value.setIsUsed(true));
        return question.orElse(null);
    }

}

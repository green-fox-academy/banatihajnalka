package com.demo.quiz.services;

import com.demo.quiz.models.entities.Question;
import com.demo.quiz.repositories.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class QuestionServiceImpl implements QuestionService {

    private QuestionRepository questionRepository;

    @Autowired
    public QuestionServiceImpl(QuestionRepository questionRepository) {
        this.questionRepository = questionRepository;
    }

    @Override
    public String getRandomQuestion() {
        return null;
//        int randomIndex = 1 + (int)(Math.random() * questionRepository.count());
//        String question = questionRepository.findById(randomIndex);
//        return question;
    }


}

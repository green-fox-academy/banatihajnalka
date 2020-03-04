package com.demo.quiz.services;

import com.demo.quiz.models.entities.Question;

import java.util.List;
import java.util.Optional;

public interface QuestionService {

    List<Question> getRandomQuestionList();

}

package com.demo.quiz.repositories;

import com.demo.quiz.models.entities.Question;
import com.demo.quiz.models.entities.dtos.CorrectAnswer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface QuestionRepository extends CrudRepository<Question, Integer> {

    List<Question> findAllByQuestion(String question);
}

package com.demo.quiz.repositories;

import com.demo.quiz.models.entities.Question;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Repository
public interface QuestionRepository extends CrudRepository<Question, Integer> {

    List<Question> findAllByQuestion(String question);
    List<Question> findAll();

    List<Question> findAllByIsUsed(boolean isUsed);
}

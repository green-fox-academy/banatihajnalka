package com.demo.quiz.models.entities;

public class CorrectAnswer {

    private String answer;
    private String correctAnswer;

    public CorrectAnswer(String answer, String correctAnswer) {
        this.answer = answer;
        this.correctAnswer = correctAnswer;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }
}

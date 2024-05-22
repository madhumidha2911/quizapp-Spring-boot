package com.codewithMadhu.quizapp.dao;

import com.codewithMadhu.quizapp.model.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuizDao extends JpaRepository<Quiz, Integer> {

}

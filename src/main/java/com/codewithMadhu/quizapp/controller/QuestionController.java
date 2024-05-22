package com.codewithMadhu.quizapp.controller;

import com.codewithMadhu.quizapp.model.Question;
import com.codewithMadhu.quizapp.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("questions")
public class QuestionController {

    @Autowired
    QuestionService questionService;

    @GetMapping("allQuestions")
    public ResponseEntity<List<Question>> getAllQuestions(){
        return questionService.getAllQuestions();
    }

    @GetMapping("category/{category}")
    public ResponseEntity<List<Question>> getQuestionsByCategory(@PathVariable String category){
        return questionService.findQuestionByCategory(category);
    }

    @PostMapping("add")
    public ResponseEntity<String> addQuestionstoData(@RequestBody Question question){
        return questionService.addQuestions(question);
    }
}

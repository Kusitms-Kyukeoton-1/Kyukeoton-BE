package com.Kyukeoton.slowerlearner.controller;


import com.Kyukeoton.slowerlearner.dto.QuestionResponse;
import com.Kyukeoton.slowerlearner.service.QuestionService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping( "/categories")
public class QuestionController {

    private final QuestionService questionService;

    @GetMapping("{categoryId}/questions")
    public ResponseEntity<QuestionResponse> findOne(@PathVariable Long categoryId, @RequestParam Integer page) {
        return ResponseEntity.ok(questionService.findOne(categoryId, page));
    }
}

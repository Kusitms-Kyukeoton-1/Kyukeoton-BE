package com.Kyukeoton.slowerlearner.controller;

import com.Kyukeoton.slowerlearner.dto.CategoryResponse;
import com.Kyukeoton.slowerlearner.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping( "/categories")
public class CategoryController {

    private final CategoryService categoryService;

    @GetMapping
    public ResponseEntity<List<CategoryResponse>> categoryList() {
        return ResponseEntity.ok(categoryService.findAll());
    }
}

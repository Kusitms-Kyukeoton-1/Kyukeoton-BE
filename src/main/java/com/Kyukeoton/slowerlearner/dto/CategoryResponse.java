package com.Kyukeoton.slowerlearner.dto;

import com.Kyukeoton.slowerlearner.domain.Category;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.stream.Collectors;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class CategoryResponse {

    private Long categoryId;
    private String name;
    private List<SubCategoryResponse> subCategoryResponses;

    public CategoryResponse(Category category) {
        this.categoryId = category.getId();
        this.name = category.getName();
        this.subCategoryResponses = category.getSubCategories()
                .stream()
                .map(SubCategoryResponse::new)
                .collect(Collectors.toList());
    }
}

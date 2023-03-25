package com.Kyukeoton.slowerlearner.dto;

import com.Kyukeoton.slowerlearner.domain.SubCategory;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class SubCategoryResponse {
    private Long categoryId;
    private String name;

    public SubCategoryResponse(SubCategory subCategory) {
        this.categoryId = subCategory.getId();
        this.name = subCategory.getName();
    }
}

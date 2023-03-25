package com.Kyukeoton.slowerlearner.dto;

import com.Kyukeoton.slowerlearner.domain.QuestionImage;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.stream.Collectors;

@NoArgsConstructor
@Getter
public class QuestionImageResponses {

    private List<QuestionImageResponse> questionResponses;

    public QuestionImageResponses(List<QuestionImage> questionImages) {
        this.questionResponses = questionImages.stream()
                .map((QuestionImageResponse::new))
                .collect(Collectors.toList());
    }


    private static class QuestionImageResponse {

        private String name;
        private String url;

        public QuestionImageResponse(QuestionImage questionImage) {
            this.name = questionImage.getName();
            this.url = questionImage.getUrl();
        }
    }
}

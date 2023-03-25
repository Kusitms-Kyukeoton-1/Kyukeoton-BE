package com.Kyukeoton.slowerlearner.dto;

import com.Kyukeoton.slowerlearner.domain.Answer;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.stream.Collectors;

@NoArgsConstructor
@Getter
public class AnswerResponses {

    private List<AnswerResponse> answers;

    public AnswerResponses(List<Answer> answers) {
        this.answers = answers.stream()
                .map(AnswerResponse::new)
                .collect(Collectors.toList());
    }

    private static class AnswerResponse {
        private String content;
        private Boolean isCorrect;

        public AnswerResponse(Answer answer) {
            this.content = answer.getContent();
            this.isCorrect = answer.getIsCorrect();
        }
    }
}

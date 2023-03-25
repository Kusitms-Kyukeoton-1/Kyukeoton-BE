package com.Kyukeoton.slowerlearner.dto;

import com.Kyukeoton.slowerlearner.domain.Answer;
import com.Kyukeoton.slowerlearner.domain.Question;
import com.Kyukeoton.slowerlearner.domain.QuestionImage;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.stream.Collectors;

@NoArgsConstructor
@Getter
public class QuestionResponse {

    private Long questionId;
    private String content;
    private List<QuestionImageResponse> questionImages;
    private List<AnswerResponse> answers;

    public QuestionResponse(Question question) {
        this.questionId = question.getId();
        this.content = question.getContent();
        this.questionImages = question.getQuestionImages()
                .stream()
                .map(QuestionImageResponse::new)
                .collect(Collectors.toList());
        this.answers = question.getAnswers()
                .stream()
                .map(AnswerResponse::new)
                .collect(Collectors.toList());
    }

    @NoArgsConstructor
    @Getter
    private static class QuestionImageResponse {
        private String name;
        private String url;

        public QuestionImageResponse(QuestionImage questionImage) {
            this.name = questionImage.getName();
            this.url = questionImage.getUrl();
        }
    }

    @NoArgsConstructor
    @Getter
    private static class AnswerResponse {
        private String content;
        private Boolean isCorrect;

        public AnswerResponse(Answer answer) {
            this.content = answer.getContent();
            this.isCorrect = answer.getIsCorrect();
        }
    }
}

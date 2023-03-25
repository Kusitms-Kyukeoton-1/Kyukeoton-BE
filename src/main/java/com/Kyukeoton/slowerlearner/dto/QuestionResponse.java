package com.Kyukeoton.slowerlearner.dto;

import com.Kyukeoton.slowerlearner.domain.Question;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class QuestionResponse {

    private Long questionId;
    private String content;
    private QuestionImageResponses questionImages;
    private AnswerResponses answers;

    public QuestionResponse(Question question) {
        this.questionId = question.getId();
        this.content = question.getContent();
        this.questionImages = new QuestionImageResponses(question.getQuestionImages());
        this.answers = new AnswerResponses(question.getAnswers());
    }
}

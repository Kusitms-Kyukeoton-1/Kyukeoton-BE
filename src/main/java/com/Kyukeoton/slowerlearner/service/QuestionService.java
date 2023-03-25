package com.Kyukeoton.slowerlearner.service;

import com.Kyukeoton.slowerlearner.domain.Question;
import com.Kyukeoton.slowerlearner.dto.QuestionResponse;
import com.Kyukeoton.slowerlearner.exception.BusinessException;
import com.Kyukeoton.slowerlearner.repository.QuestionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class QuestionService {

    private final QuestionRepository questionRepository;

    public QuestionResponse findOne(Long categoryId, Integer page) {
        List<Question> questions = questionRepository.findByCategoryId(categoryId, PageRequest.of(page, 1));
        validateQuestionSize(questions);
        return new QuestionResponse(questions.get(0));
    }

    private static void validateQuestionSize(List<Question> questions) {
        if (questions.isEmpty()) {
            throw new BusinessException("존재하지 않는 카테고리 문제입니다!!!");
        }
    }
}

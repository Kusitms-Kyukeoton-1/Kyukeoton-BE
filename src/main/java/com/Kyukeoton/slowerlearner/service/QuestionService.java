package com.Kyukeoton.slowerlearner.service;

import com.Kyukeoton.slowerlearner.domain.Question;
import com.Kyukeoton.slowerlearner.dto.QuestionResponse;
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
        return new QuestionResponse(questions.get(0));
    }
}

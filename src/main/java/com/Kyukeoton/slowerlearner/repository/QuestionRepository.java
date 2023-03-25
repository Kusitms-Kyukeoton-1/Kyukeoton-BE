package com.Kyukeoton.slowerlearner.repository;

import com.Kyukeoton.slowerlearner.domain.Question;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface QuestionRepository extends JpaRepository<Question, Long> {

    List<Question> findByCategoryId(Long categoryId, Pageable pageable);
}

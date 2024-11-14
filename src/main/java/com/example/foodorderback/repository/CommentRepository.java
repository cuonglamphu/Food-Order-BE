package com.example.foodorderback.repository;

import com.example.foodorderback.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {
    List<Comment> findByMealId(Long mealId); // Tìm comment theo Meal ID
}

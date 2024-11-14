package com.example.foodorderback.service;

import com.example.foodorderback.dto.CommentDTO;
import java.util.List;

public interface CommentService {
    CommentDTO addComment(CommentDTO commentDTO);
    List<CommentDTO> getCommentsByMealId(Long mealId);
    void deleteComment(Long commentId);
}

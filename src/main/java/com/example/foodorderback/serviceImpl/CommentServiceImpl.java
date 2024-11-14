package com.example.foodorderback.serviceImpl;

import com.example.foodorderback.dto.CommentDTO;
import com.example.foodorderback.model.Comment;
import com.example.foodorderback.model.Meal;
import com.example.foodorderback.repository.CommentRepository;
import com.example.foodorderback.repository.MealRepository;
import com.example.foodorderback.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CommentServiceImpl implements CommentService {

    @Autowired
    private CommentRepository commentRepository;

    @Autowired
    private MealRepository mealRepository;

    @Override
    public CommentDTO addComment(CommentDTO commentDTO) {
        Meal meal = mealRepository.findById(commentDTO.getMealId()).orElseThrow(
                () -> new IllegalArgumentException("Invalid meal ID"));

        Comment comment = new Comment(commentDTO.getAuthor(), commentDTO.getContent(), LocalDateTime.now(), meal);
        Comment savedComment = commentRepository.save(comment);
        return new CommentDTO(savedComment.getId(), savedComment.getAuthor(), savedComment.getContent(),
                savedComment.getCreated_at(), meal.getId());
    }

    @Override
    public List<CommentDTO> getCommentsByMealId(Long mealId) {
        List<Comment> comments = commentRepository.findByMealId(mealId);
        return comments.stream().map(comment -> new CommentDTO(
                        comment.getId(), comment.getAuthor(), comment.getContent(), comment.getCreated_at(), mealId))
                .collect(Collectors.toList());
    }

    @Override
    public void deleteComment(Long commentId) {
        commentRepository.deleteById(commentId);
    }
}

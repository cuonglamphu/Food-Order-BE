package com.example.foodorderback.dto;

import java.time.LocalDateTime;

public class CommentDTO {

    private Long id;
    private String author;
    private String content;
    private LocalDateTime created_at;
    private Long mealId;

    // Constructors
    public CommentDTO() {}

    public CommentDTO(Long id, String author, String content, LocalDateTime created_at, Long mealId) {
        this.id = id;
        this.author = author;
        this.content = content;
        this.created_at = created_at;
        this.mealId = mealId;
    }

    // Getters and setters...

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDateTime getCreated_at() {
        return created_at;
    }

    public void setCreated_at(LocalDateTime created_at) {
        this.created_at = created_at;
    }

    public Long getMealId() {
        return mealId;
    }

    public void setMealId(Long mealId) {
        this.mealId = mealId;
    }
}

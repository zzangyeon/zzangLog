package com.hello.project.repository;

import com.hello.project.domain.comment.Comment;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommentRepository extends JpaRepository<Comment, Long>{

    Slice<Comment> findAllByArticleId(Long articleId, Pageable pageable);
    void deleteByArticleId(Long articleId);
}

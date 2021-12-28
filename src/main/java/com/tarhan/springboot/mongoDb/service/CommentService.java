package com.tarhan.springboot.mongoDb.service;

import com.tarhan.springboot.mongoDb.entity.Category;
import com.tarhan.springboot.mongoDb.entity.Comment;

import java.util.List;

public interface CommentService {
    List<Comment> findAll();

    Comment findById(String id) ;

    Comment save(Comment comment);

    void delete(String id) ;
}

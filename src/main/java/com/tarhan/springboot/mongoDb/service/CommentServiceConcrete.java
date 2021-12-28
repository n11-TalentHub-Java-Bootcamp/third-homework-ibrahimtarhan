package com.tarhan.springboot.mongoDb.service;

import com.tarhan.springboot.mongoDb.entity.Comment;
import com.tarhan.springboot.mongoDb.service.entityService.CommentEntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentServiceConcrete implements CommentService{

    @Autowired
    private CommentEntityService commentEntityService;
    @Override
    public List<Comment> findAll() {
        return commentEntityService.findAll();
    }

    @Override
    public Comment findById(String id) {
        return commentEntityService.findById(id);
    }

    @Override
    public Comment save(Comment comment) {
        return commentEntityService.save(comment);
    }

    @Override
    public void delete(String id) {
        commentEntityService.deleteById(id);
    }
}

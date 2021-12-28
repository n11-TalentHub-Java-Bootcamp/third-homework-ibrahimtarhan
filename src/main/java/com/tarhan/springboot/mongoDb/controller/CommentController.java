package com.tarhan.springboot.mongoDb.controller;

import com.tarhan.springboot.mongoDb.entity.Comment;
import com.tarhan.springboot.mongoDb.entity.User;
import com.tarhan.springboot.mongoDb.service.CommentService;
import com.tarhan.springboot.mongoDb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/comments/")
public class CommentController {

    @Autowired
    private CommentService commentService;

    @GetMapping("")
    public List<Comment> findAll() {
        return commentService.findAll();
    }

    @GetMapping("/{id}")
    public Comment findById(@PathVariable String id) {
        return commentService.findById(id);
    }

    @PostMapping("")
    public ResponseEntity<Object> save(@RequestBody Comment comment) {

        comment = commentService.save(comment);

        return new ResponseEntity<>(comment, HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id) {
        commentService.delete(id);
    }
}

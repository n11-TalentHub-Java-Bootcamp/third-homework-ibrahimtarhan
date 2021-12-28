package com.tarhan.springboot.mongoDb.service.entityService;

import com.tarhan.springboot.mongoDb.entity.Comment;
import com.tarhan.springboot.mongoDb.entity.User;
import com.tarhan.springboot.mongoDb.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class CommentEntityService {

    @Autowired
    private CommentRepository commentRepository;

    public List<Comment> findAll() {
        return commentRepository.findAll();
    }

    public Comment findById(String id){

        Optional<Comment> optional = commentRepository.findById(id);
        Comment comment = null;
        if (optional.isPresent()){
            comment = optional.get();
        }
        return comment;
    }
    public void deleteById(String id){
        commentRepository.deleteById(id);
    }

    public Comment save(Comment comment){
        return commentRepository.save(comment);
    }
}

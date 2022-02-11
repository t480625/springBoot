package com.example.demo.services;

import com.example.demo.model.Comment;
import com.example.demo.proxies.CommentNotificationProxy;
import com.example.demo.reositories.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.stereotype.Component;

//@Component
public class CommentService {

    @Autowired
    private CommentRepository commentRepository;
    @Autowired
    private CommentNotificationProxy commentNotificationProxy;

//    public CommentService(CommentRepository commentRepository,
//                          CommentNotificationProxy commentNotificationProxy) {
//
//        this.commentRepository = commentRepository;
//        this.commentNotificationProxy = commentNotificationProxy;
//    }

    public void publishComment(Comment comment) {
        commentRepository.storeComment(comment);
        commentNotificationProxy.sendComment(comment);
    }
}

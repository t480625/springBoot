package com.example.demo.proxies;

import com.example.demo.model.Comment;

public interface CommentNotificationProxy {

    void sendComment(Comment comment);
}

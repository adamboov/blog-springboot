package com.adam.blog.service;

import com.adam.blog.entity.Comment;

import java.util.List;

public interface CommentService {

    List<Comment> listCommentByBlogId(Long BlogId);

    Comment saveComment(Comment comment);
}

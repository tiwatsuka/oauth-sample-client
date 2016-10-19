package org.example.oauth.domain.service.comment;

import org.example.oauth.domain.model.comment.Comment;


public interface CommentService {

	Comment getComment(Long id);

	void createComment(Comment comment);
}

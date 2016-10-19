package org.example.oauth.domain.service.comment;

import org.example.oauth.domain.model.comment.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestOperations;

@Service
@Transactional
public class CommentServiceImpl implements CommentService {

	@Autowired
	RestOperations restOperations;

	final String uri = "http://localhost:8080/sample-oauth-resource-web/api/comment/{id}";

	@Override
	public Comment getComment(Long id) {
		return restOperations.getForObject(uri, Comment.class, id);
	}

	@Override
	public void createComment(Comment comment) {
		restOperations.postForLocation(uri, comment);
	}

}

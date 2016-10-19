package org.example.oauth.app.comment;

import org.example.oauth.domain.model.comment.Comment;
import org.example.oauth.domain.service.comment.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/comment")
public class CommentController {

	@Autowired
	CommentService commentService;
	
	@RequestMapping("/{id}")
	public String showCommment(@PathVariable("id") Long id, Model model){
		Comment comment = commentService.getComment(id);
		model.addAttribute("comment", comment);
		return "comment/show";
	}
	
}

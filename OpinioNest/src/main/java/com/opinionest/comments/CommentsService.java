package com.opinionest.comments;

import org.springframework.stereotype.Service;

import com.opinionest.users.UsersEntity;
import com.opinionest.users.UsersRepository;

@Service
public class CommentsService {
	
	private CommentsRepository commentsRepository;

	public CommentsService(CommentsRepository commentsRepository) {
		this.commentsRepository = commentsRepository;
	}
	
	

}

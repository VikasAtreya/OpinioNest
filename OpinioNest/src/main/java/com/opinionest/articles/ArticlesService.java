package com.opinionest.articles;

import org.springframework.stereotype.Service;

@Service
public class ArticlesService {
	
	private ArticleRepository articleRepository;

	public ArticlesService(ArticleRepository articleRepository) {
		this.articleRepository = articleRepository;
	}

}

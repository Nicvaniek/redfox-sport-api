package com.redfox.redfoxsportapi.controllers;


import java.util.List;

import com.redfox.redfoxsportapi.controllers.models.ArticlesResponse;
import com.redfox.redfoxsportapi.models.news.Article;
import com.redfox.redfoxsportapi.services.ArticlesService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "articles")
public class ArticlesController {
    
    private ArticlesService articlesService;

    @Autowired
    public ArticlesController(ArticlesService articlesService) {
        this.articlesService = articlesService;
    }

    @GetMapping()
    public ResponseEntity<ArticlesResponse> getArticles() {
        List<Article> articles = articlesService.getSportsHeadlines();
        return ResponseEntity
            .status(HttpStatus.OK)
            .body(new ArticlesResponse(articles));
    }
}
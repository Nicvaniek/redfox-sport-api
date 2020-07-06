package com.redfox.redfoxsportapi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.redfox.redfoxsportapi.controllers.models.ArticlesResponse;
import com.redfox.redfoxsportapi.models.articles.Article;
import com.redfox.redfoxsportapi.models.enums.Sport;
import com.redfox.redfoxsportapi.services.articles.ArticlesService;

@RestController
@RequestMapping(path = "articles")
public class ArticlesController {
    
    private ArticlesService articlesService;

    @Autowired
    public ArticlesController(ArticlesService articlesService) {
        this.articlesService = articlesService;
    }

    @GetMapping()
    public ArticlesResponse getArticles(@RequestParam(required = false, value = "sport") Sport sport) {
        List<Article> articles = sport != null 
            ? articlesService.getSportsHeadlines(sport)
            : articlesService.getSportsHeadlines();
        return new ArticlesResponse(articles);
    }
}
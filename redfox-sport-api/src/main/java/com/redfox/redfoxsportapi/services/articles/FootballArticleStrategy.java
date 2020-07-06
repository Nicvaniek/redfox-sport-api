package com.redfox.redfoxsportapi.services.articles;

import java.util.ArrayList;
import java.util.List;

import com.redfox.redfoxsportapi.models.articles.Article;

import org.springframework.stereotype.Component;

@Component
public class FootballArticleStrategy implements ArticleStrategy {

    @Override
    public List<Article> getArticles() {
        return new ArrayList<>();
    }
    
}
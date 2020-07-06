package com.redfox.redfoxsportapi.services.articles;

import java.util.List;

import com.redfox.redfoxsportapi.models.articles.Article;

@FunctionalInterface
public interface ArticleStrategy {
    List<Article> getArticles();
}
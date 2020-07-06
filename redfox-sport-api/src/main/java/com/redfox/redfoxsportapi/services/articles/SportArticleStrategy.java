package com.redfox.redfoxsportapi.services.articles;

import java.util.List;
import java.util.stream.Collectors;

import com.redfox.redfoxsportapi.clients.NewsApiClient;
import com.redfox.redfoxsportapi.clients.models.TopHeadlinesResponse;
import com.redfox.redfoxsportapi.models.articles.Article;
import com.redfox.redfoxsportapi.models.mappers.ArticleMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SportArticleStrategy implements ArticleStrategy {

    @Value("${NEWS_API_KEY}")
    private String newsApiKey;

    @Value("${NEWS_API_SPORT_COUNTRY}")
    private String newsApiSportCountry;

    @Value("${NEWS_API_CATEGORY}")
    private String newsApiCategory;

    private final NewsApiClient newsApiClient;

    private final ArticleMapper articleMapper;

    @Autowired
    public SportArticleStrategy(NewsApiClient newsApiClient, ArticleMapper articleMapper) {
        this.newsApiClient = newsApiClient;
        this.articleMapper = articleMapper;
    }
    @Override
    public List<Article> getArticles() {
        TopHeadlinesResponse response = newsApiClient.getTopHeadlines(newsApiSportCountry, newsApiKey, newsApiCategory);
        return response.getArticles().stream()
            .map(newsApiArticle -> articleMapper.mapNewsApiArticleToArticle(newsApiArticle))
            .collect(Collectors.toList());
    }
    
}
package com.redfox.redfoxsportapi.services;

import java.util.List;

import com.redfox.redfoxsportapi.clients.NewsApiClient;
import com.redfox.redfoxsportapi.clients.models.TopHeadlinesResponse;
import com.redfox.redfoxsportapi.models.news.Article;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ArticlesService {
    private final NewsApiClient newsApiClient;

    private final String COUNTRY = "za";
    private final String API_KEY = "def659578bf8422b976543e4dbfe5caf";
    private final String CATEGORY = "sports";


    @Autowired
    public ArticlesService(NewsApiClient newsApiClient) {
        this.newsApiClient = newsApiClient;
    }

    public List<Article> getSportsHeadlines() {
        TopHeadlinesResponse response = newsApiClient.getTopHeadlines(COUNTRY, API_KEY, CATEGORY);
        return response.getArticles();
    }
}
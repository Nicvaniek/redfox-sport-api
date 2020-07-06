package com.redfox.redfoxsportapi.services.articles;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.redfox.redfoxsportapi.models.articles.Article;
import com.redfox.redfoxsportapi.models.enums.Sport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ArticlesService {
    private final Map<Sport, ArticleStrategy> articleStrategies = new HashMap<>();

    private final SportArticleStrategy sportArticleStrategy;
    private final FootballArticleStrategy footballArticleStrategy;

    @Autowired
    public ArticlesService(SportArticleStrategy sportArticleStrategy, FootballArticleStrategy footballArticleStrategy) {
        this.sportArticleStrategy = sportArticleStrategy;
        this.footballArticleStrategy = footballArticleStrategy;
        setupStrategies();
    }

    public List<Article> getSportsHeadlines() {
        return sportArticleStrategy.getArticles();
    }

    public List<Article> getSportsHeadlines(Sport sport) {
        return articleStrategies.get(sport).getArticles();
    }

    private void setupStrategies() {
        articleStrategies.put(Sport.FOOTBALL, footballArticleStrategy);
    }
}
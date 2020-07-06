package com.redfox.redfoxsportapi.clients.models;

import java.util.List;

import com.redfox.redfoxsportapi.models.articles.NewsApiArticle;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class TopHeadlinesResponse {
    private String status;
    private Integer totalResults;
    private List<NewsApiArticle> articles;
}
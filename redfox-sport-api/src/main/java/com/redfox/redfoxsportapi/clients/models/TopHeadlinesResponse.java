package com.redfox.redfoxsportapi.clients.models;

import java.util.List;

import com.redfox.redfoxsportapi.models.news.Article;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class TopHeadlinesResponse {
    private String status;
    private Integer totalResults;
    private List<Article> articles;
}
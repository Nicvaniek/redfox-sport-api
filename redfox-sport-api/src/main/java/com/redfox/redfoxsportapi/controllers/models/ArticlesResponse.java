package com.redfox.redfoxsportapi.controllers.models;

import java.util.List;

import com.redfox.redfoxsportapi.models.news.Article;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ArticlesResponse {
    private List<Article> articles;
}
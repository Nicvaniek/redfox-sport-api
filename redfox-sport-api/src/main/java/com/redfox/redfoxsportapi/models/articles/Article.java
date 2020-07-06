package com.redfox.redfoxsportapi.models.articles;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Article {
    private String source;
    private String author;
    private String title;
    private String description;
    private String articleUrl;
    private String imageUrl;
    private String publishedAt;
    private String content;
}
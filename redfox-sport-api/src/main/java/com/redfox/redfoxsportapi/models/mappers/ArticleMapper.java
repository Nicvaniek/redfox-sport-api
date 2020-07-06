package com.redfox.redfoxsportapi.models.mappers;

import com.redfox.redfoxsportapi.models.articles.Article;
import com.redfox.redfoxsportapi.models.articles.NewsApiArticle;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ArticleMapper {
    @Mapping(target = "source", source = "source.name")
    @Mapping(target = "articleUrl", source = "url")
    @Mapping(target = "imageUrl", source = "urlToImage")
    Article mapNewsApiArticleToArticle(NewsApiArticle newsApiArticle);
}
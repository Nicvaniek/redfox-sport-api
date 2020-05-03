package com.redfox.redfoxsportapi.clients;

import com.redfox.redfoxsportapi.clients.models.TopHeadlinesResponse;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "news-api", url = "https://newsapi.org/v2/")
public interface NewsApiClient {
    
    @GetMapping(path = "/top-headlines")
    TopHeadlinesResponse getTopHeadlines(
        @RequestParam("country") String country, 
        @RequestParam("apiKey") String apiKey, 
        @RequestParam("category") String category
    );
}
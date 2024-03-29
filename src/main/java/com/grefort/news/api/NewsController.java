package com.grefort.news.api;

import com.grefort.news.models.News;
import com.grefort.news.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class NewsController {
    @Autowired
    NewsService newsService;
    @GetMapping(value = "/news")
    public List<News> getAllNews(){
        return newsService.getAllNews();
    }
}

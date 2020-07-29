package com.self.learn.crawler.controller;

import com.self.learn.crawler.service.CrawlerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private CrawlerService crawlerService;

    @GetMapping("/id")
    public List<String> productByID(){
        crawlerService.CrawlAndSave();
        return Arrays.asList("a","b","c");
    }
}

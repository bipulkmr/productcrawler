package com.self.learn.crawler.service;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Service;

@Service
public class CrawlerService {

    public void CrawlAndSave(){
        crawl();
    }

    private void crawl(){
        try{
        Document doc = Jsoup.connect("https://www.amazon.in/mobile-phones/b/?ie=UTF8&node=1389401031&ref_=nav_cs_mobiles").get();
        Elements productElements = doc.getElementsByClass("s-result-item  celwidget  ");
//        Elements classElements = doc.getElementsByClass("a-link-normal s-access-detail-page s-color-twister-title-link a-text-normal");
//        Elements  elements = doc.getElementsByAttribute("a-link-normal s-access-detail-page s-color-twister-title-link a-text-normal");
        System.out.println(productElements);
        System.out.println("Class ELements: "+ productElements);
            for (Element element: productElements
                 ) {
                System.out.println(element.getElementsByClass("a-link-normal s-access-detail-page s-color-twister-title-link a-text-normal").attr("title"));
                System.out.println(element.getElementsByClass("a-size-base a-color-price s-price a-text-bold").text());
                System.out.println(element.getElementsByClass("a-link-normal a-text-normal").attr("href"));
            }

        }catch (Exception e){

        }
    }

    private void save() {

    }
}

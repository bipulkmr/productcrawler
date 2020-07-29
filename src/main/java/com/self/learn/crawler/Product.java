package com.self.learn.crawler;

import lombok.Data;

@Data
public class Product {

    private String productId;
    private String productName;
    private String productDescription;

    private Integer productPrice;
    private String productURl;
    private String productSource;
    private String category;



}

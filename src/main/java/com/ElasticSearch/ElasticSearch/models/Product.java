package com.ElasticSearch.ElasticSearch.models;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
@Getter
@Setter
@Document(indexName = "product")
public class Product {
    @Id
    private String id;
    private String title;
    private String description;
    private String image;
    private int inventoryCount;
    private String category;
    private int priceValue;
}

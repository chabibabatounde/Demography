package com.example.demo.model;

import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName = "demography_database", type = "demography", shards = 2)
public class Demography {
}

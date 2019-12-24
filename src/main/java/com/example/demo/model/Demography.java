package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName = "demography_database", type = "demography", shards = 2)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Demography {

    @Id
    private String id;
    private String personName;
    private int value;
    private  double cityLat;
    private  double cityLng;

}

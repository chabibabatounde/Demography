package com.example.demo.repository;

import com.example.demo.model.Demography;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.io.Serializable;
import java.util.List;

public interface CustomDemographyRepository extends ElasticsearchRepository<Demography, String> {
    List<Demography> findByPersonName(String personName);

}

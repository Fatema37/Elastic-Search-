package com.ElasticSearch.ElasticSearch.repositories;

import com.ElasticSearch.ElasticSearch.models.Product;
import org.springframework.data.elasticsearch.core.RefreshPolicy;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface  ProductRepo extends  ElasticsearchRepository<Product, String> {

    @Override
    <S extends Product> S save(S entity, RefreshPolicy refreshPolicy);
    @Override
    <S extends Product> S save(S entity);

  List<Product> findByTitle(String title);
}

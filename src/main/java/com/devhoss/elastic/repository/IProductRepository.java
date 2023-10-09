package com.devhoss.elastic.repository;




import com.devhoss.elastic.model.Product;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface IProductRepository extends ElasticsearchRepository<Product,Integer> {

}
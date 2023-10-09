package com.devhoss.elastic.service;

import com.devhoss.elastic.model.Product;

public interface IProductService {

    public Iterable<Product> getProducts();

    public Product insertProduct(Product product);

    public Product updateProduct(Product product, int id);

    public void deleteProduct(int id );
}

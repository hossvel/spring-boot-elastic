package com.devhoss.elastic.service;

import com.devhoss.elastic.model.Product;
import org.springframework.beans.factory.annotation.Autowired;

import com.devhoss.elastic.repository.IProductRepository;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements IProductService{

	 @Autowired
	    private IProductRepository  iProductRepository;
	

    public Iterable<Product> getProducts() {
     return iProductRepository.findAll();
    }

    public Product insertProduct(Product product) {
        return iProductRepository.save(product);
    }

    public Product updateProduct(Product product, int id) {
        Product product1  = iProductRepository.findById(id).get();
        product1.setPrice(product.getPrice());
        return product1;
    }

    public void deleteProduct(int id ) {
    	iProductRepository.deleteById(id);
    }
}

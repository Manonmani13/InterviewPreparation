package com.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public Product saveProduct(Product product) {
    	 if (product.getAttributes() != null) {
             for (Attribute attribute : product.getAttributes()) {
                 attribute.setProduct(product);
             }
         }        return productRepository.save(product);
    }

    public Product getProduct(Long id) {
        return productRepository.findById(id).orElse(null);
    }
}
package org.example.midtermjava.service.serviceimpl;

import org.example.midtermjava.model.Product;
import org.example.midtermjava.repository.ProductRepository;
import org.example.midtermjava.service.ProductService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    private final ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> getAllProducts() {
        return productRepository.getAllProducts();
    }

}

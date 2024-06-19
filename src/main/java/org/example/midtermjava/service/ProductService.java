package org.example.midtermjava.service;

import org.example.midtermjava.model.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProductService {
    List<Product> getAllProducts();
}

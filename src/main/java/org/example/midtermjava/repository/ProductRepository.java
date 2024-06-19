package org.example.midtermjava.repository;

import org.apache.ibatis.annotations.*;
import org.example.midtermjava.model.Product;

import java.util.List;

@Mapper
public interface ProductRepository {

    @Select("SELECT * FROM product")
    List<Product> getAllProducts();
}

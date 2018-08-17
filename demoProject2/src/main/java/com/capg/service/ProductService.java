package com.capg.service;

import java.math.BigDecimal;
import java.util.Optional;

import com.capg.bean.Products;

public interface ProductService {


public void addProduct(int id, String name, String Model, String price);

public void deleteProductById(int id);

public Optional<Products> getProductsById(int id);

public Iterable<Products> findAll();
}

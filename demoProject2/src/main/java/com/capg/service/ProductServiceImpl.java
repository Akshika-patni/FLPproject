package com.capg.service;

import java.math.BigDecimal;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.capg.bean.Products;

import com.capg.repo.ProductRepo;
@Service
public class ProductServiceImpl implements ProductService{
	@Autowired
	private ProductRepo repo1;
	/*@Override
	public Optional<Products> getProductById(int parseInt) {
		// TODO Auto-generated method stub
		return null;
	}
*/
	@Override
	public void addProduct(int id, String name, String Model, String price) {
		// TODO Auto-generated method stub
		Products p=new Products();
		p.setId(id);
		p.setName(name);
		p.setModel(Model);
		p.setPrice(price);
		
		
		
		repo1.save(p);
	}
	@Override
	public void deleteProductById(int id) {
		// TODO Auto-generated method stub
		repo1.deleteById(id);
	}
	@Override
	public Optional<Products> getProductsById(int id) {
		// TODO Auto-generated method stub
		return repo1.findById(id);
	}
	@Override
	public Iterable<Products> findAll() {
		// TODO Auto-generated method stub
		return  repo1.findAll();
	}

	
	
	
	
	
	
	
	
}

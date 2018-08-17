package com.capg.controller;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.capg.bean.Merchants;
import com.capg.bean.Products;
import com.capg.service.MerchantService;
import com.capg.service.ProductService;

@RestController
public class MerchantController {

	@Autowired
	MerchantService service;
	@Autowired
    ProductService  service1;
	@RequestMapping("/getMerchants")
	public Optional<Merchants> getMerchantById(@RequestParam String id) {
		return service.getMerchantById(Integer.parseInt(id));
	}

	
	   @RequestMapping(value="/Merchants")
	    public List<Merchants> getMerchants() { 

		Iterable<Merchants> merchants=service.findAll();
	       return  (List<Merchants>) merchants;
	      
	    }
	
	   @RequestMapping(value = "/addMerchants{id}{name}{organisation}")
 void addMerchant(@RequestParam String id,@RequestParam String name,@RequestParam String organisation) {

	    service.addMerchant(Integer.parseInt(id), name, organisation);
	    System.out.println("Added Successfully");
	
	    }
	
	   @RequestMapping("/deleteMerchant")
		public void deleteMerchantById(@RequestParam String id) {
		service.deleteMerchantById(Integer.parseInt(id));
		}
	  
	   
	   
	   @RequestMapping(value = "/addProducts{id}{name}{Model}{price}")
	   public void addProduct(@RequestParam String id,@RequestParam String name,@RequestParam String Model,@RequestParam String price) {

	  	    service1.addProduct(Integer.parseInt(id), name, Model,price);
	  	    System.out.println("Added Successfully");
	  	
	  	    }
	   

	   @RequestMapping("/deleteProduct")
		public void deleteProductById(@RequestParam String id) {
		service1.deleteProductById(Integer.parseInt(id));
		}
		@RequestMapping("/getProducts")
		public Optional<Products> getProductsById(@RequestParam String id) {
			return service1.getProductsById(Integer.parseInt(id));
		}
		   @RequestMapping(value="/Products")
		    public List<Products> getProducts() { 

			Iterable<Products> products=service1.findAll();
		       return  (List<Products>) products;
		      
		    }

}

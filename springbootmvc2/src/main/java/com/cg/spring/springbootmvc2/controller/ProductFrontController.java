package com.cg.spring.springbootmvc2.controller;


import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.cg.spring.springbootmvc2.beans.Merchants;
import com.cg.spring.springbootmvc2.beans.Products;



@RestController
public class ProductFrontController {

	
	@RequestMapping("/DisplayMerchants")
	
	public Merchants getMerchants(@RequestParam String id) {
	
	RestTemplate rt=new RestTemplate();
	Merchants p=rt.getForObject("http://localhost:9095/getMerchants?id="+id, Merchants.class);
	return p;

    }
	@RequestMapping("/ListofAllMerchants")
	
	public List<Merchants> getMerchant() {
		System.out.println("sd");
		RestTemplate rt2=new RestTemplate();
		List<Merchants> p1= rt2.getForObject("http://localhost:9095/Merchants", ArrayList.class);
		return  p1;
       }
	
	

@RequestMapping("/addmerchantsfront")

public Merchants addMerchant(@RequestParam String id,@RequestParam String name,@RequestParam String organisation) {


RestTemplate rt4=new RestTemplate();
Merchants p=rt4.getForObject("http://localhost:9095/addMerchants?id="+id+"&name="+name+"&organisation="+organisation, Merchants.class);
return p;

}
@RequestMapping("/DeleteMerchants")

public Merchants deleteMerchant(@RequestParam String id) {


RestTemplate rt5=new RestTemplate();
Merchants p=rt5.getForObject("http://localhost:9095/deleteMerchant?id="+id, Merchants.class);
return p;

}
@RequestMapping("/addproductsfront")

public Products addProduct(@RequestParam String id,@RequestParam String name,@RequestParam String Model,@RequestParam String price) {


RestTemplate rt6=new RestTemplate();
Products p=rt6.getForObject("http://localhost:9095/addProducts?id="+id+"&name="+name+"&Model="+Model+"&price="+price,Products.class);
return p;

}
@RequestMapping("/DeleteProducts")

public Products deleteProduct(@RequestParam String id) {


RestTemplate rt7=new RestTemplate();
Products p=rt7.getForObject("http://localhost:9095/deleteProduct?id="+id, Products.class);
return p;

}

@RequestMapping("/DisplayProducts")

public Products getProducts(@RequestParam String id) {

RestTemplate rt8=new RestTemplate();
Products p=rt8.getForObject("http://localhost:9095/getProducts?id="+id, Products.class);
return p;

}
@RequestMapping("/ListofAllProducts")

public List<Products> getProduct() {
	System.out.println("sd");
	RestTemplate rt9=new RestTemplate();
	List<Products> p1= rt9.getForObject("http://localhost:9095/Products", ArrayList.class);
	return  p1;
   }
}
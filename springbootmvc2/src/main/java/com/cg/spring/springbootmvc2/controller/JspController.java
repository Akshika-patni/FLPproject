package com.cg.spring.springbootmvc2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class JspController {




	@RequestMapping("/ManageMerchants")
	public String showProductByIdPage() {
		return "ManageMerchants";
	}
	@RequestMapping("/ThirdPartyMerchants2")
	public String ahowProductByIdPage() {
		return "ThirdPartyMerchants2";
	}
	@RequestMapping("/index")
	public String addMerchants (){
		return "index";
	}
	@RequestMapping("/Delete")
	public String deleteMerchant (){
		return "Delete";
	}
	@RequestMapping("/Display")
	public String displayMerchant (){
		return "Display";
	}
	@RequestMapping("/DisplayAll")
	public String displayAllMerchant (){
		return "DisplayAll";
	}

	@RequestMapping("/ManageProducts")
	public String ghowProductByIdPage() {
		return "ManageProducts";
	}
	@RequestMapping("/ThirdPartyMerchants3")
	public String hhowProductByIdPage() {
		return "ThirdPartyMerchants3";
	}
	@RequestMapping("/index1")
	public String addProduct(){
		return "index1";
	}
	@RequestMapping("/DeleteProduct")
	public String deleteProduct(){
		return "DeleteProduct";
	}
	@RequestMapping("/DisplayProduct")
	public String displayProduct(){
		return "DisplayProduct";
	}
	}



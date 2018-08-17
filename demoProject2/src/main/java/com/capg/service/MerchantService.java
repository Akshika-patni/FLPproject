package com.capg.service;


import java.math.BigDecimal;
import java.util.Optional;

import com.capg.bean.Merchants;

public interface MerchantService {
	public	Optional<Merchants> getMerchantById(int id);
	public Iterable<Merchants> findAll() ;
	public void addMerchant(int id, String name, String organization);
	public void deleteMerchantById(int id);
	
	
		
	}

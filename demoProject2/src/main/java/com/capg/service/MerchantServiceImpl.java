package com.capg.service;




import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.bean.Merchants;
import com.capg.repo.MerchantRepo;




@Service
public class MerchantServiceImpl implements MerchantService {

	@Autowired
	private MerchantRepo repo;

	@Override
	public Optional<Merchants> getMerchantById(int id) {
		// TODO Auto-generated method stub
		return repo.findById(id);
	}

	@Override
	public Iterable<Merchants> findAll() {
		// TODO Auto-generated method stub
		return  repo.findAll();
	}

	@Override
	public void addMerchant(int id, String name, String organization){
		// TODO Auto-generated method stub
		Merchants m=new Merchants();
		m.setId(id);
		m.setName(name);
		m.setOrganisation(organization);
		
		
		repo.save(m);
		
	}

	@Override
	public void deleteMerchantById(int id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
	}
	





}	


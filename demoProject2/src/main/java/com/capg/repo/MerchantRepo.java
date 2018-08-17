package com.capg.repo;



import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.capg.bean.Merchants;

@Repository
public interface MerchantRepo extends CrudRepository<Merchants,Integer>{



	

	
}

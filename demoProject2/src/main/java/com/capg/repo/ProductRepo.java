package com.capg.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import com.capg.bean.Products;


@Repository
public interface ProductRepo extends CrudRepository<Products,Integer>{

}

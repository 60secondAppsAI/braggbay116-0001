package com.braggbay116.dao;

import java.util.List;

import com.braggbay116.dao.GenericDAO;
import com.braggbay116.domain.Product;





public interface ProductDAO extends GenericDAO<Product, Integer> {
  
	List<Product> findAll();
	






}



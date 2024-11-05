package com.braggbay116.dao;

import java.util.List;

import com.braggbay116.dao.GenericDAO;
import com.braggbay116.domain.Order;





public interface OrderDAO extends GenericDAO<Order, Integer> {
  
	List<Order> findAll();
	






}



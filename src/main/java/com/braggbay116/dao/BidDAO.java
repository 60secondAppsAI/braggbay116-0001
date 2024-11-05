package com.braggbay116.dao;

import java.util.List;

import com.braggbay116.dao.GenericDAO;
import com.braggbay116.domain.Bid;





public interface BidDAO extends GenericDAO<Bid, Integer> {
  
	List<Bid> findAll();
	






}



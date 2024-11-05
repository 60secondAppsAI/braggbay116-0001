package com.braggbay116.dao;

import java.util.List;

import com.braggbay116.dao.GenericDAO;
import com.braggbay116.domain.Auction;





public interface AuctionDAO extends GenericDAO<Auction, Integer> {
  
	List<Auction> findAll();
	






}



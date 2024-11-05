package com.braggbay116.dao;

import java.util.List;

import com.braggbay116.dao.GenericDAO;
import com.braggbay116.domain.Review;





public interface ReviewDAO extends GenericDAO<Review, Integer> {
  
	List<Review> findAll();
	






}



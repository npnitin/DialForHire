package com.dialforhire.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dialforhire.bo.Estimate;

@Repository
public interface EstimateRepository extends JpaRepository<Estimate, Integer> {
	
	

}

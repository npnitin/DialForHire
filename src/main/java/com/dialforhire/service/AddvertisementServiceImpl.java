package com.dialforhire.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.dialforhire.bo.Addvertisement;
import com.dialforhire.dao.AddvertisementRepository;

public class AddvertisementServiceImpl implements AddvertisementService {
	
	@Autowired
	AddvertisementRepository addvertisementRepository;

	@Override
	public List<Addvertisement> getAllAdds() {
		return addvertisementRepository.findAll();
	}

}

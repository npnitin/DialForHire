package com.dialforhire.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dialforhire.bo.Estimate;
import com.dialforhire.service.EstimateServce;

@RestController
@RequestMapping(value="/advertisement")
public class AddvertisementController {
	
	@Autowired
	EstimateServce service;
	
	@PostMapping("/getAllAdds")
	public Estimate getAllAdds(@RequestBody Estimate estimate){
		return service.save(estimate);
	}
	
	
	
	
	

}

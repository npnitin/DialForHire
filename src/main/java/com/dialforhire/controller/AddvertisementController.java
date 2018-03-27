package com.dialforhire.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dialforhire.bo.Addvertisement;

@RestController
@RequestMapping(value="/advertisement")
public class AddvertisementController {
	
	
	@GetMapping("/getAllAdds")
	public List<Addvertisement> getAllAdds(){
		return null;
	}

}

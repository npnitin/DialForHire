package com.dialforhire.DialForHire;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.dialforhire.bo.Estimate;
import com.dialforhire.bo.Machine;
import com.dialforhire.bo.MachineOPeratingCost;
import com.dialforhire.service.EstimateServce;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@SpringBootApplication
@ComponentScan("com.dialforhire")
@EntityScan("com.dialforhire")
@EnableJpaRepositories("com.dialforhire")
public class DialForHireApplication {

	@Autowired
	static EstimateServce service;
	public static void main(String[] args) throws JsonProcessingException {
		SpringApplication.run(DialForHireApplication.class, args);
		
		MachineOPeratingCost cost = new MachineOPeratingCost();
		cost.setAnnunalInflation(10);
		
		Machine machine = new Machine();
		machine.setAnnualHours(100);
		machine.setMachineOPeratingCost(cost);
		
		
		Set<Machine> machines = new HashSet<>();
		machines.add(machine);
		
		Estimate e= new Estimate();
		e.setMachines(machines);
		
		
		
		System.out.println(new ObjectMapper().writeValueAsString(e));
		
	}
}

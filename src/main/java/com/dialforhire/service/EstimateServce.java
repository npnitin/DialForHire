package com.dialforhire.service;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dialforhire.bo.Estimate;
import com.dialforhire.bo.Machine;
import com.dialforhire.bo.MachineOPeratingCost;
import com.dialforhire.dao.EstimateRepository;
import com.dialforhire.dao.MachineOperatingCostRepository;

@Service
public class EstimateServce {
	
	@Autowired
	EstimateRepository estimateRepository;
	
	@Autowired
	MachineOperatingCostRepository costRepository;
	
	
	public Estimate  save(Estimate estimate) {
		Set<Machine> machines = new HashSet<Machine>();
		machines = estimate.getMachines();
		Iterator itr =  machines.iterator();
		while(itr.hasNext()) {
			Machine m = (Machine) itr.next();
			MachineOPeratingCost cost  =costRepository.save(m.getMachineOPeratingCost());
			m.setMachineOPeratingCost(cost);
		}
		return estimateRepository.save(estimate);
	}

}

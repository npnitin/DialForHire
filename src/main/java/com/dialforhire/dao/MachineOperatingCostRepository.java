package com.dialforhire.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dialforhire.bo.MachineOPeratingCost;

@Repository
public interface MachineOperatingCostRepository extends JpaRepository<MachineOPeratingCost, Long> {

}

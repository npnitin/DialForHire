package com.dialforhire.bo;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tco_machine")
public class Machine {
	
	 	@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name = "machine_id")
	    private Integer machineId;


	    @Column(name = "equipment_id")
	    private Integer equipmentId;


	    @Column(name = "model_id")
	    private Integer modelId;



	    @Column(name = "total_purchase_price")
	    private Integer totalPurchasePrice;


	    @Column(name = "expected_years_owned")
	    private Double expectedYearsOwned;


	    @Column(name = "annual_hours")
	    private Integer annualHours;



	    @ManyToOne
	    @JoinColumn(name="estimate_id")
	    private Estimate estimate;
	    
	    
	    @OneToOne(cascade=CascadeType.ALL)
	    @JoinColumn(name="machine_id")
	    private MachineOPeratingCost machineOPeratingCost;



		public Integer getMachineId() {
			return machineId;
		}



		public void setMachineId(Integer machineId) {
			this.machineId = machineId;
		}



		public Integer getEquipmentId() {
			return equipmentId;
		}



		public void setEquipmentId(Integer equipmentId) {
			this.equipmentId = equipmentId;
		}



		public Integer getModelId() {
			return modelId;
		}



		public void setModelId(Integer modelId) {
			this.modelId = modelId;
		}



		public Integer getTotalPurchasePrice() {
			return totalPurchasePrice;
		}



		public void setTotalPurchasePrice(Integer totalPurchasePrice) {
			this.totalPurchasePrice = totalPurchasePrice;
		}



		public Double getExpectedYearsOwned() {
			return expectedYearsOwned;
		}



		public void setExpectedYearsOwned(Double expectedYearsOwned) {
			this.expectedYearsOwned = expectedYearsOwned;
		}



		public Integer getAnnualHours() {
			return annualHours;
		}



		public void setAnnualHours(Integer annualHours) {
			this.annualHours = annualHours;
		}



		public Estimate getEstimate() {
			return estimate;
		}



		public void setEstimate(Estimate estimate) {
			this.estimate = estimate;
		}



		public MachineOPeratingCost getMachineOPeratingCost() {
			return machineOPeratingCost;
		}



		public void setMachineOPeratingCost(MachineOPeratingCost machineOPeratingCost) {
			this.machineOPeratingCost = machineOPeratingCost;
		}

	    

}

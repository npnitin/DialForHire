package com.dialforhire.bo;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "TCO_MACHINE_OPERATING_COSTS")
public class MachineOPeratingCost {
	
	 	@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name = "ID")
	    private Long id;

	  
	    @Column(name = "MACHINE_ID")
	    private Integer machineID;

	   
	    @Column(name = "ANNUAL_INFLATION")
	    private Integer annunalInflation;

	   
	    @Column(name = "TECHNICIAN_LABOR_RATE")
	    private Integer technicalLabourRate;

	   
	    @Column(name = "TOTAL_PM_ONSITE_VISITS")
	    private Integer totalPMOnsiteVisits;

	   
	    @Column(name = "OSV_FEE")
	    private Integer osvFee;

	   
	    @Column(name = "AVG_MILES")
	    private Integer avgMiles;

	   
	    @Column(name = "MILEAGE_CHARGE")
	    private Integer milageCharge;

	    
	    @Column(name = "AVG_TRAVEL")
	    private Integer avgTravel;

	    
	    @Column(name = "TRAVEL_TIME_CHARGE")
	    private Integer travelTimeCharge;
	    
	    @OneToOne(mappedBy="machineOPeratingCost",cascade=CascadeType.ALL)
	    private Machine machine;


		public Long getId() {
			return id;
		}


		public void setId(Long id) {
			this.id = id;
		}


		public Integer getMachineID() {
			return machineID;
		}


		public void setMachineID(Integer machineID) {
			this.machineID = machineID;
		}


		public Integer getAnnunalInflation() {
			return annunalInflation;
		}


		public void setAnnunalInflation(Integer annunalInflation) {
			this.annunalInflation = annunalInflation;
		}


		public Integer getTechnicalLabourRate() {
			return technicalLabourRate;
		}


		public void setTechnicalLabourRate(Integer technicalLabourRate) {
			this.technicalLabourRate = technicalLabourRate;
		}


		public Integer getTotalPMOnsiteVisits() {
			return totalPMOnsiteVisits;
		}


		public void setTotalPMOnsiteVisits(Integer totalPMOnsiteVisits) {
			this.totalPMOnsiteVisits = totalPMOnsiteVisits;
		}


		public Integer getOsvFee() {
			return osvFee;
		}


		public void setOsvFee(Integer osvFee) {
			this.osvFee = osvFee;
		}


		public Integer getAvgMiles() {
			return avgMiles;
		}


		public void setAvgMiles(Integer avgMiles) {
			this.avgMiles = avgMiles;
		}


		public Integer getMilageCharge() {
			return milageCharge;
		}


		public void setMilageCharge(Integer milageCharge) {
			this.milageCharge = milageCharge;
		}


		public Integer getAvgTravel() {
			return avgTravel;
		}


		public void setAvgTravel(Integer avgTravel) {
			this.avgTravel = avgTravel;
		}


		public Integer getTravelTimeCharge() {
			return travelTimeCharge;
		}


		public void setTravelTimeCharge(Integer travelTimeCharge) {
			this.travelTimeCharge = travelTimeCharge;
		}


		public Machine getMachine() {
			return machine;
		}


		public void setMachine(Machine machine) {
			this.machine = machine;
		}

	    
	    

}

package com.dialforhire.bo;

import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tco_estimate")
public class Estimate {
	
	 	@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name = "estimate_id")
	    private Integer estimateID;

	    
	    @Column(name = "customer_name")
	    private String customerName;

	    
	    @Column(name = "country_cd")
	    private String countryCD;

	    
	    @Column(name = "location")
	    private String location;

	   
	    @Column(name = "created_ts")
	    private Date createdTS;

	   
	    @Column(name = "modified_ts")
	    private Date modifiedTS;

	   
	    @Column(name = "created_by_id")
	    private String created_By;

	  
	    @Column(name = "modified_by_id")
	    private String modified_By;

	    
	    @OneToMany(cascade=CascadeType.ALL)
	    @JoinColumn(name="estimate_id")
	    private Set<Machine> machines;


		public Integer getEstimateID() {
			return estimateID;
		}


		public void setEstimateID(Integer estimateID) {
			this.estimateID = estimateID;
		}


		public String getCustomerName() {
			return customerName;
		}


		public void setCustomerName(String customerName) {
			this.customerName = customerName;
		}


		public String getCountryCD() {
			return countryCD;
		}


		public void setCountryCD(String countryCD) {
			this.countryCD = countryCD;
		}


		public String getLocation() {
			return location;
		}


		public void setLocation(String location) {
			this.location = location;
		}


		public Date getCreatedTS() {
			return createdTS;
		}


		public void setCreatedTS(Date createdTS) {
			this.createdTS = createdTS;
		}


		public Date getModifiedTS() {
			return modifiedTS;
		}


		public void setModifiedTS(Date modifiedTS) {
			this.modifiedTS = modifiedTS;
		}


		public String getCreated_By() {
			return created_By;
		}


		public void setCreated_By(String created_By) {
			this.created_By = created_By;
		}


		public String getModified_By() {
			return modified_By;
		}


		public void setModified_By(String modified_By) {
			this.modified_By = modified_By;
		}


		public Set<Machine> getMachines() {
			return machines;
		}


		public void setMachines(Set<Machine> machines) {
			this.machines = machines;
		}
	    
	    

}

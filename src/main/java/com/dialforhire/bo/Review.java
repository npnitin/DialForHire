package com.dialforhire.bo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "dfh_review")
public class Review {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "RID")
	private int id;
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "rating")
	private int rating;
	
	@ManyToOne
	private Addvertisement addvertisement;
	
	@Column(name = "emailOfReviewer")
	private String emailOfReviewer;
	
	@Column(name = "nameOfReviewer")
	private String nameOfReviewer;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public Addvertisement getAddvertisement() {
		return addvertisement;
	}

	public void setAddvertisement(Addvertisement addvertisement) {
		this.addvertisement = addvertisement;
	}

	public String getEmailOfReviewer() {
		return emailOfReviewer;
	}

	public void setEmailOfReviewer(String emailOfReviewer) {
		this.emailOfReviewer = emailOfReviewer;
	}

	public String getNameOfReviewer() {
		return nameOfReviewer;
	}

	public void setNameOfReviewer(String nameOfReviewer) {
		this.nameOfReviewer = nameOfReviewer;
	}
	
	
	

}

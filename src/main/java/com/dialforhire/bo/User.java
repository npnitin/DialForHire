package com.dialforhire.bo;

import java.util.List;

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
@Table(name="dfh_user")
public class User {
	
		@Id
		@GeneratedValue(strategy=GenerationType.AUTO)
		@Column(name="UID")
		private int id;
		
		@Column(name="email")
		private String email;
		
		@Column(name="phone")
		private String phone;
		
		@Column(name="password")
		private String password;
		
		@OneToMany(cascade=CascadeType.ALL)
		@JoinColumn(name="user_id")
		private List<Addvertisement> addvertisements;

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getPhone() {
			return phone;
		}

		public void setPhone(String phone) {
			this.phone = phone;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public List<Addvertisement> getAddvertisements() {
			return addvertisements;
		}

		public void setAddvertisements(List<Addvertisement> addvertisements) {
			this.addvertisements = addvertisements;
		}
		
		
}

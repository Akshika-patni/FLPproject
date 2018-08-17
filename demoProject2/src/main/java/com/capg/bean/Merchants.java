package com.capg.bean;

	import javax.persistence.CascadeType;
import javax.persistence.Column;
	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

	@Entity
	public class Merchants {

		@Id
		@GeneratedValue(strategy=GenerationType.AUTO)//GENERATING VALUES AUTOMATICALLY
	    private int id;
		
		@Column(name="merchant_name")
		private String name;
		
		@Column(name="merchant_organistaion")
		private String organisation;
		
		@OneToOne(cascade=CascadeType.ALL)
		@JoinColumn(name="m_id")
         private Products products;
		
		public Products getProducts() {
			return products;
		}

		public void setProducts(Products products) {
			this.products = products;
		}

		public Merchants(int id, String name, String organisation) {
			super();
			this.id = id;
			this.name = name;
			this.organisation = organisation;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getOrganisation() {
			return organisation;
		}

		public void setOrganisation(String organisation) {
			this.organisation = organisation;
		}
		public 	Merchants() {
		}
		}
		




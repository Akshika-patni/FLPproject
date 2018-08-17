package com.cg.spring.springbootmvc2.beans;



public class Merchants{

	private int id;
	private String name;
	private String Organisation;
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
		return Organisation;
	}
	public void setOrganisation(String organisation) {
		Organisation = organisation;
	}
	
	@Override
	public String toString() {
		return "Merchants [id=" + id + ", name=" + name + ", Organisation=" + Organisation + "]";
	}
	public Merchants(int id, String name, String organisation) {
		super();
		this.id = id;
		this.name = name;
		Organisation = organisation;
	}
public Merchants() {
	
}
}	
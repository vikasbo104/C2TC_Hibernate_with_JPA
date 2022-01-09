package com.cg.jpastart.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
          //@Table(name="address")
public class Address implements Serializable
{
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ADDRESS_ID")
	private int address_id;
	
	@Column(name="ADDRESS_STREET")
	private String street;
	
	@Column(name="ADDRESS_CITY")
	private String city;
	
	@Column(name="ADDRESS_STATE")
	private String state;
	
	@Column(name="ADDRESS_ZIPCODE")
	private String zipCode;
	
	
	@OneToOne(mappedBy="address")
	private Student student;
	
	
	
	

	public int getAddress_id() {
		return address_id;
	}

	public void setAddress_id(int address_id) {
		this.address_id = address_id;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	

}

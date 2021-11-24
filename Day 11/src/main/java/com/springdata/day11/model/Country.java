package com.springdata.day11.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "country")
public class Country {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int id;

	String countryName;
	String capitalName;
	String population;

	// Constructors
	public Country() {

	}

	public Country(String countryName, String capitalName, String population) {
		this.countryName = countryName;
		this.capitalName = capitalName;
		this.population = population;
	}

	// Getters
	public int getId() {
		return id;
	}

	public String getCountryName() {
		return countryName;
	}

	public String getCapitalName() {
		return capitalName;
	}

	public String getPopulation() {
		return population;
	}

	// Setters
	public void setId(int id) {
		this.id = id;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public void setCapitalName(String capitalName) {
		this.capitalName = capitalName;
	}

	public void setPopulation(String population) {
		this.population = population;
	}
}
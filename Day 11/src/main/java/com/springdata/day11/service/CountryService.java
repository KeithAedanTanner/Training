package com.springdata.day11.service;

import com.springdata.day11.model.*;
import com.springdata.day11.repo.*;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CountryService {
	@Autowired
	CountryRepo countryRepo;

	public List<Country> getCountryList() {
		return countryRepo.findAll();
	}

	public void delete(int id) {
		countryRepo.deleteById(id);
	}

	public Country get(int id) {
		return countryRepo.findById(id).get();
	}

	public void saveCountry(Country country) {
		countryRepo.save(country);
	}
}
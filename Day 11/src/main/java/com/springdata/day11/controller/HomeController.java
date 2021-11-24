package com.springdata.day11.controller;

import com.springdata.day11.model.*;
import com.springdata.day11.service.*;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	@Autowired
	CountryService countryService;

	@RequestMapping("/")
	public String listCountries(Model model) {
		List<Country> list = countryService.getCountryList();
		model.addAttribute("countries", list);
		return "countries"; // View name
	}

	@RequestMapping("/show_info/{id}")
	public ModelAndView showCountryInfo(@PathVariable(name = "id") int id) {
		ModelAndView show = new ModelAndView("country_info");
		Country country = countryService.get(id);
		show.addObject("country", country);
		return show;
	}

	@RequestMapping("/delete/{id}")
	public String deleteCountry(@PathVariable(name = "id") int id) {
		countryService.delete(id);
		return "redirect:/";
	}

	@RequestMapping("/edit/{id}")
	public ModelAndView showEditCountryPage(@PathVariable(name = "id") int id) {
		ModelAndView edit = new ModelAndView("edit_country");
		Country country = countryService.get(id);
		edit.addObject("country", country);
		return edit;
	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveCountry(@ModelAttribute("country") Country country) {
		countryService.saveCountry(country);
		return "redirect:/";
	}

	@RequestMapping("/new")
	public String newCountry(Model model) {
		Country country = new Country();
		model.addAttribute("country", country);
		return "new_country";
	}
}
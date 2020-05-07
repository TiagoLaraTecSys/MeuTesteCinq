package com.laratecsys.testecinqspringrest.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.laratecsys.testecinqspringrest.Entity.City;
import com.laratecsys.testecinqspringrest.Entity.Country;
import com.laratecsys.testecinqspringrest.Repositories.CityRepositories;

@Service
public class CityService {
	
	@Autowired
	private CityRepositories cityRepositories;
	
	@Autowired
	private CountryService countryService;
	
	public List<City> findByCountry(Country country) {
		
		Country objCountry = countryService.findByName(country.getName());
		
		List<City> obj = cityRepositories.findAllByCountry(objCountry);
		return obj;
		
	}

}

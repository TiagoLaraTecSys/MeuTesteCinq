package com.laratecsys.testecinqspringrest.Resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.laratecsys.testecinqspringrest.Entity.City;
import com.laratecsys.testecinqspringrest.Entity.Country;
import com.laratecsys.testecinqspringrest.Services.CityService;

@RestController
@RequestMapping(value = "/rest")
public class CityResources {

	@Autowired
	private CityService cityServices;

	@RequestMapping(value = "/cities", method = RequestMethod.GET)
	public ResponseEntity<List<City>> find(@RequestParam(value = "country") String country) {
		
		List<City> obj = cityServices.findByCountry(new Country(null,country));
		return ResponseEntity.ok().body(obj);
	}

}

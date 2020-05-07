package com.laratecsys.testecinqspringrest.Resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.laratecsys.testecinqspringrest.Entity.Country;
import com.laratecsys.testecinqspringrest.Services.CountryService;

@RestController
@RequestMapping(value = "/rest")
public class CountryResources {

	@Autowired
	private CountryService countryServices;

	@RequestMapping(value = "/country", method = RequestMethod.GET)
	public ResponseEntity<Country> find(@RequestParam(value = "cities") Integer country) {

		Country obj = countryServices.findById(country);
		return ResponseEntity.ok().body(obj);
	}

}

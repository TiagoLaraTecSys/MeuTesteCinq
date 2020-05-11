package com.laratecsys.testecinqspringrest;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.rules.ExpectedException;
import org.springframework.boot.test.context.SpringBootTest;

import com.laratecsys.testecinqspringrest.Entity.City;
import com.laratecsys.testecinqspringrest.Entity.Country;
import com.laratecsys.testecinqspringrest.Services.CountryService;
import com.laratecsys.testecinqspringrest.Services.exceptions.ObjectNotFoundException;

@SpringBootTest
class TesteCinqSpringRestApplicationTests {

	City city = new City();
	
	@Test
	void contextLoads() {
		
	}
	
	//Primeira letra do País em mínusculo
	String cntry1 = "Uni";
	CountryService countryService = new CountryService();
	
	@Test
	public void findByName() {
		assertEquals(new Country(3, "United State"), countryService.findByName(cntry1));
	}

	

}

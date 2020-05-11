package com.laratecsys.testecinqspringrest.Services;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.laratecsys.testecinqspringrest.Services.exceptions.ObjectNotFoundException;

public class CityServiceTest {

	
	//Primeira letra do País em mínusculo
	String cntry1 = "uni";
	CountryService countryService = new CountryService();
	
	@Test(expected =ObjectNotFoundException.class)
	public void findByName() {
		assertEquals(new ObjectNotFoundException(""), countryService.findByName(cntry1));
	}

	
}

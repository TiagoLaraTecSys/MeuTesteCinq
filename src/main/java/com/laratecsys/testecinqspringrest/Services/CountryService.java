package com.laratecsys.testecinqspringrest.Services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.laratecsys.testecinqspringrest.Entity.Country;
import com.laratecsys.testecinqspringrest.Repositories.CountryRepositories;
import com.laratecsys.testecinqspringrest.Services.exceptions.ObjectNotFoundException;

@Service
public class CountryService {
	
	@Autowired
	private CountryRepositories countryRepositories;
	
	public Country findById(Integer id) {

		Optional<Country> obj = countryRepositories.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrador. ID:" + id + ", Tipo:" + Country.class.getName(), null));
		
	}
	
	public Country findByName(String name) 
	{
		Optional<Country> obj = countryRepositories.findByNameLike("%"+name+"%");
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Pais não encontrador. Pais:" + name+ ", Tipo:" + Country.class.getName(), null));
		
	}

}

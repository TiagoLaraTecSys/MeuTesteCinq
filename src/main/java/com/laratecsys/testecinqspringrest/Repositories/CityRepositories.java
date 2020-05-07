package com.laratecsys.testecinqspringrest.Repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.laratecsys.testecinqspringrest.Entity.City;
import com.laratecsys.testecinqspringrest.Entity.Country;

@Repository
public interface CityRepositories extends JpaRepository<City, Integer>{
	
	@Transactional(readOnly = true)
	List<City> findAllByCountry(Country country);

}

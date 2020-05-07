package com.laratecsys.testecinqspringrest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.laratecsys.testecinqspringrest.Entity.Country;
import com.laratecsys.testecinqspringrest.Repositories.CountryRepositories;

@SpringBootApplication
public class TesteCinqSpringRestApplication implements CommandLineRunner {
	
	@Autowired
	private CountryRepositories countryRepositories;

	public static void main(String[] args) {
		SpringApplication.run(TesteCinqSpringRestApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		List<Country>countrys = countryRepositories.findAll();
		System.out.println(countrys.toString());
	}

}

package com.laratecsys.testecinqspringrest.Repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.laratecsys.testecinqspringrest.Entity.Country;

@Repository
public interface CountryRepositories extends JpaRepository<Country, Integer>{

	@Transactional(readOnly = true)
	Optional<Country> findByNameLike(String name);
}

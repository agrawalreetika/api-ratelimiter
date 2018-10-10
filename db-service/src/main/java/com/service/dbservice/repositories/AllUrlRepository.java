package com.service.dbservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.service.dbservice.tables.UrlsList;

public interface AllUrlRepository extends JpaRepository<UrlsList, String> {
	
	UrlsList findUrlRow(@Param(value = "api") String limitUrl);
}

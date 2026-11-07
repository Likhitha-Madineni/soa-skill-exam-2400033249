package com.klef.soa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.klef.soa.entity.Clinic;

@Repository
public interface ClinicRepository extends JpaRepository<Clinic, Long>{
	List<Clinic> findByName(String name);
	List<Clinic> findByType(String type);
	

	
}

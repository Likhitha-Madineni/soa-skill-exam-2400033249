package com.klef.soa.service;

import java.util.List;

import com.klef.soa.entity.Clinic;

public interface ClinicService {
	
	Clinic addClinic(Clinic clinic);
	Clinic updateClinic(Clinic c);
	String deleteClinicById(Long id);
	List<Clinic> displayAll();
	Clinic displayById(Long id);
	List<Clinic> displayclinicByName(String name);
	List<Clinic>displayclinicByType(String type);
	
	

}

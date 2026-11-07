package com.klef.soa.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.soa.entity.Clinic;
import com.klef.soa.repository.ClinicRepository;

@Service
public class ClinicServiceImpl implements ClinicService {
	
	@Autowired
	private ClinicRepository repo;

	@Override
	public Clinic addClinic(Clinic clinic) {
		return repo.save(clinic);
		
	}
	

	@Override
	public Clinic updateClinic(Clinic c) {
		
		
		Optional <Clinic> optional=repo.findById(c.getClinicId());
		if(optional.isPresent()) {
		
			Clinic clinic =optional.get();
			
			clinic.setName(c.getName());
			clinic.setLocation(c.getLocation());
			clinic.setType(c.getType());
			return repo.save(clinic);
		}
		else {
		return null;
	}

	}
	@Override
	public String deleteClinicById(Long id) {
		boolean status=repo.existsById(id);
		if(status) {
			repo.deleteById(id);
			
			return "ID is deleted Successfully";
		}else {
		return "ID not Found";
	}
	}

	@Override
	public List<Clinic> displayAll() {
		return repo.findAll();
	}

	@Override
	public Clinic displayById(Long id) {
		// TODO Auto-generated method stub
		return repo.findById(id).orElse(null);
	}

	@Override
	public List<Clinic> displayclinicByName(String name) {
		// TODO Auto-generated method stub
		return repo.findByName(name);
	}

	@Override
	public List<Clinic> displayclinicByType(String type) {
		// TODO Auto-generated method stub
		return repo.findByType(type);
	}
	
	
	

}

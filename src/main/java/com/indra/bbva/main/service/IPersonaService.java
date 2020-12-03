package com.indra.bbva.main.service;

import java.util.List;

import com.indra.bbva.main.models.Persona;

public interface IPersonaService {
	
	public List<Persona> findAll();
	
	public Persona findById(Long id);
	
	public void deleteById(Long id);
	
	public Persona save(Persona p);
	

	
	

}

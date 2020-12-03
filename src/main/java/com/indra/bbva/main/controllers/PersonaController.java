package com.indra.bbva.main.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.indra.bbva.main.models.Persona;
import com.indra.bbva.main.service.IPersonaService;


@RestController
public class PersonaController {
	
	@Autowired
	private IPersonaService ipersona;
	
	 	@GetMapping("/personas")
	    public List<Persona> listar(){
	        return ipersona.findAll();
	    }
	    @GetMapping("/personas/{id}")
	    public Persona ver(@PathVariable Long id){
	        return ipersona.findById(id);
	    }
	    
	    @PostMapping("/personas")
	    public Persona crear(Persona p) {
	    	return ipersona.save(p);
	    }
	    
	    @PutMapping("/personas/{id}")
	    public Persona actualizar(Persona p,@PathVariable Long id) {
	    	Persona persona=ipersona.findById(id);
	    			persona.setName(p.getName());
	    			persona.setLastname(p.getLastname());
	    			persona.setEmail(p.getEmail());
	    			return persona;
	    }
	    
	    

}

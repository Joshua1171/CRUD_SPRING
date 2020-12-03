package com.indra.bbva.main.dao;


import org.springframework.data.repository.CrudRepository;

import com.indra.bbva.main.models.Persona;

public interface IPersonaDao extends CrudRepository<Persona,Long> {
	 // custom query example and return a stream
   // @Query("select p from Perspma p where p.name = :name")
   // public Persona BuscarPorNombre(String nombre);
	



}

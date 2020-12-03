package com.indra.bbva.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.indra.bbva.main.dao.IPersonaDao;
import com.indra.bbva.main.models.Persona;

@Service
public class IPersonaServiceImpl implements IPersonaService {
	
	@Autowired
	private IPersonaDao ipersonaDao;

	@Override
	@Transactional(readOnly=true)
	public List<Persona> findAll() {
		// TODO Auto-generated method stub
		return  (List<Persona>)ipersonaDao.findAll();
	}

	@Override
	@Transactional(readOnly=true)
	public Persona findById(Long id) {
		// TODO Auto-generated method stub
		return ipersonaDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		ipersonaDao.deleteById(id);
	}

	@Override
	@Transactional
	public Persona save(Persona p) {
		// TODO Auto-generated method stub
		return ipersonaDao.save(p);
	}

}

package com.example.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Abdul;
import com.example.repository.AbdulRepository;

@Service
public class AbdulServiceImpl implements AbdulService {
	
	@Autowired
	
	private AbdulRepository repo;
	
	
	

	@Override
	public List<Abdul> getAllAbduls() {
		
		return repo.findAll();
	}




	@Override
	public Abdul saveAbdul(Abdul abdul) {
	    
		
		return repo.save(abdul);
		
	}




	@Override
	public Abdul getAbdulById(long id) {
		
		return repo.getById(id);
	}




	@Override
	public void deleteAbdulById(long id) {
		
	this.repo.deleteById(id);
	}


		
	}



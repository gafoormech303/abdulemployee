package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Abdul;
import com.example.service.AbdulService;

@RestController
public class AbdulController {
	
	
	@Autowired
	
	private AbdulService service;
	
	@GetMapping("/")
	public List<Abdul> getAllAbduls(Abdul abdul) {
		
  service.getAllAbduls(abdul);
   		return abdul;
	}
	

	@PostMapping("/saveAbdul")
	
	public Abdul saveAbdul(@RequestBody Abdul abdul) {
	
	
	return service.saveAbdul(abdul);	
}

	@GetMapping("/deleteAbdul/{id}")
	public void deleteAbdul(@PathVariable(value="id") long id) {
		
		//service.deleteAbdulById(id);
		 service.deleteAbdulById(id);
		
	}
	
	@GetMapping("/update/{id}")
	
	public String update(@PathVariable(value="id") long id, Abdul abdul) {
		
		Abdul abdul1= service.getAbdulById(id);
		
		
		return "update_abdul";
		
		
		
		
		
	}
	
	
	
	
}

	
	
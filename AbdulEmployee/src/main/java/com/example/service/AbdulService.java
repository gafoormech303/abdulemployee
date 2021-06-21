package com.example.service;

import java.util.List;

import com.example.model.Abdul;

public interface AbdulService {

	
	List<Abdul> getAllAbduls(Abdul abdul);
	
	Abdul saveAbdul(Abdul abdul);
	
	Abdul getAbdulById(long id);
	void deleteAbdulById(long id);
	
	
}

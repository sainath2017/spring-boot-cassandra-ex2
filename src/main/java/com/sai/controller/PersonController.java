package com.sai.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sai.model.Person;
import com.sai.service.PersonService;

@RestController
@RequestMapping("/v1-person")
public class PersonController {
	
	@Autowired
	private PersonService personService;
	

	@GetMapping(value = "/")
	public ResponseEntity<List<Person>> getPersonDetails() {
		return new ResponseEntity<>(personService.getPersonDetails(), HttpStatus.OK);
	}
	
}

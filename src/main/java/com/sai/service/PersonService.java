package com.sai.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.cassandra.core.CassandraOperations;
import org.springframework.stereotype.Service;

import com.sai.model.Person;

@Service
public class PersonService {
	
	@Autowired
	private CassandraOperations cassandraOperations;
			
	public List<Person> getPersonDetails() {
		return cassandraOperations.select("select * from person", Person.class);
	}

}

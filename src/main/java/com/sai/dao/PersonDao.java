package com.sai.dao;

import org.springframework.data.repository.CrudRepository;

import com.sai.model.Person;

public interface PersonDao extends CrudRepository<Person, Long>{

}

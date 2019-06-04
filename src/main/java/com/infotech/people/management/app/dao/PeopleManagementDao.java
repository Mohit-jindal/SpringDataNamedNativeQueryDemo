package com.infotech.people.management.app.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.infotech.people.management.app.entities.Person;

@Repository
public interface PeopleManagementDao extends CrudRepository<Person, Integer> 
{
	//please follow spring data JPA official website for more query methods and check query creation topic
	
	List<Person> getPersonInfoByLastName(String lastName);
	
	//this is the way to define query method
	//from this query method Spring Data JPA will drive the query on the fly
	List<Person> findByFirstNameAndEmail(String firstName, String email);
	
}

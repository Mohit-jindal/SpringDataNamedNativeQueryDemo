package com.infotech.people.management.app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.infotech.people.management.app.entities.Person;
import com.infotech.people.management.app.service.PeopleManagementService;

@SpringBootApplication
public class PeopleManagementSpringBootDataAppApplication implements CommandLineRunner
{

	@Autowired
	private PeopleManagementService peopleManagementService;
	
	public static void main(String[] args) {
		SpringApplication.run(PeopleManagementSpringBootDataAppApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception 
	{
		//getPersonsInfoByLastName();
		getPersonsInfoByFirstNameAndEmail();
		
	}

	private void getPersonsInfoByFirstNameAndEmail() 
	{
		List<Person> personList = peopleManagementService.getPersonsInfoByFirstNameAndEmail("Barry","barry.j2007@gmail.com");
		personList.forEach(System.out::println);
	}

	private void getPersonsInfoByLastName() 
	{
		List<Person> personList = peopleManagementService.getPersonsInfoByLastName("Murphy");
		personList.forEach(System.out::println);
	}

}

package com.ashu.spring.orm.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ashu.spring.orm.api.dao.PersonDao;
import com.ashu.spring.orm.api.model.Person;

@RestController
@RequestMapping("/person")
public class PersonController {
	
	@Autowired
	PersonDao dao;

	@PostMapping(value = "/savePerson")
	public String savePerson(@RequestBody Person person) {
		dao.savePerson(person);
		return "success";
	}
	
	@GetMapping("/getPersons")
	public List<Person> getPersons(){
		return dao.getPersons();
	}
}

package com.example.angular.demo.controller;


import java.util.Arrays;
import java.util.List;

import com.example.angular.demo.model.Person;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicController {

	@GetMapping("/getPersons")
	public List<Person> getPersons() {
		List<Person> personList = Arrays.asList(new Person("Tom", "이태원"),
												new Person("영희", "서초구"),
												new Person("탄탄이", "서현"),
												new Person("대통령", "청와대"));

		return personList;
	}
}

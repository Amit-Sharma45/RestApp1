package com.BikkadIT.RestfulFirstApp.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class PersonController {
    @GetMapping("/getPerson")
	public ResponseEntity<Person> getPerson() {
		Person p = new Person();
		p.setPid(111);
		p.setPname("Amit");
		p.setPaddress("Bhiwani");
		return new ResponseEntity<Person>(p, HttpStatus.OK);
	}
}

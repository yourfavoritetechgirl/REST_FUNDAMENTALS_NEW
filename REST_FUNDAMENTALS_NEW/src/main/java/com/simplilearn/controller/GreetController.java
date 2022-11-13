package com.simplilearn.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.simplilearn.pojo.Greet;

@RestController
public class GreetController {
	
	//@GetMapping("/greet")
	@RequestMapping(value="/greet", method= RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public Greet greetMe() {
		Greet greet = new Greet();
		greet.setName("Savyata");
		greet.setMessage("Hello Learners!");
		return greet;
	}

}

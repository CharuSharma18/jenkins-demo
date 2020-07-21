package com.example.jenkinsdemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JenkinsDemoController {

	@RequestMapping("/info")
	public String greetings(@RequestParam(required = false, value = "name") String name) {

		if (name != null)
			return "Greetings " + name + "..!";
		else
			return "Greetings Stranger..!";

	}

}

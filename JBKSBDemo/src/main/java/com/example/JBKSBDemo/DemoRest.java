package com.example.JBKSBDemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/student")
public class DemoRest {

	@GetMapping(value="/getStudent")
	public String RestM1() {
		return "hello student";
	}
}

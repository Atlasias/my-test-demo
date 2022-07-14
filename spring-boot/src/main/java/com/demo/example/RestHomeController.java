package com.demo.example;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestHomeController {

	@RequestMapping(value="/", method= {RequestMethod.GET,RequestMethod.POST})
	public String restHomeRequest() {
		return "hi! welcome to demo project";
	}
	
}

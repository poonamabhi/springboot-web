package com.springexample.restservices.Hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@RequestMapping(method = RequestMethod.GET,path="/hello")
	@GetMapping("/hello1")
	public String HelloWorld() {
		return "hello Poonam1";
	}

}

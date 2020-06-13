package com.springexample.restservices.Hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	//@RequestMapping(method = RequestMethod.GET,path="/hello")
	@GetMapping("/hello")
	public String HelloWorld() {
		return "hello Poonam1";
	}
	@GetMapping("/hello1")
	public UserDetails Hello1() {
		return new UserDetails("poonam","singh","delhi");
	}

}

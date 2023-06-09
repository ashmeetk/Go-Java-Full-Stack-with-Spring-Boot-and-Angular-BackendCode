package com.in28minutes.rest.webservices.restfulwebservices.helloworld;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.in28minutes.rest.webservices.restfulwebservices.helloworld.HelloWorldBean;

@RestController
@CrossOrigin(origins="http://localhost:4200")
public class HelloWorldController {
	
	@GetMapping(path = "/hello-world")
	public String helloWorld()
	{
		return "Hello World";
	}
	
	@GetMapping(path = "/hello-world-bean")
	public HelloWorldBean helloWorldBean()
	{
		//throw new RuntimeException("Some Error has happened! Contact Support at ***_***");
		return new HelloWorldBean("Hello World - Changed");
	}
	
	@GetMapping(path = "/hello-world/path-variable/{name}")
	public HelloWorldBean helloWorldPathVariable(@PathVariable String name)
	{
		return new HelloWorldBean(String.format("Hello World, %s", name));
	}

}

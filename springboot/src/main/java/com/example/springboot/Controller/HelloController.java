package com.example.springboot.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.springboot.model.HelloBean;

@CrossOrigin(origins = "http://localhost:4200/")
@RestController
public class HelloController {

	@
	GetMapping("/Hello")
	public HelloBean getHello() {
		HelloBean h = new HelloBean();
		h.setMessage("Hello World");
		return h;
	//	return "Hello World";
	}
	
	@
	GetMapping("/Hello/{id}")
	public HelloBean getHelloaram(@PathVariable String id) {
		HelloBean h = new HelloBean();
		h.setMessage(id);
		return h;
	//	return "Hello World";
	}
	
	
	
}

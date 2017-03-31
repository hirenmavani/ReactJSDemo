package com.example.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@SpringBootApplication
@ComponentScan(value={"com.example"})
@Controller
public class ReactJsTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReactJsTestApplication.class, args);
	}
	
	@RequestMapping(value="/hello.html",method=RequestMethod.GET)
	public String hello(){
		return "hello";
	}
}
